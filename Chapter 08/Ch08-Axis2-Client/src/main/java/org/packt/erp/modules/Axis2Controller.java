package org.packt.erp.modules;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Axis2Controller {
	
	@RequestMapping("/erp/profiles")
	public @ResponseBody String testData(){
		String firstName = "error";
		try {
			Axis2SpringServiceStub stub = new Axis2SpringServiceStub();
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
			Axis2SpringServiceStub.GetAllPersons allPersons = new Axis2SpringServiceStub.GetAllPersons();
					Axis2SpringServiceStub.GetAllPersonsResponse response = stub.getAllPersons(allPersons);
			Axis2SpringServiceStub.Person[] persons = response.get_return();
			 firstName = persons[0].getFirstName();
			for(Axis2SpringServiceStub.Person p : persons){
				System.out.println(p.getFirstName());
			}
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return firstName;
	}

}
