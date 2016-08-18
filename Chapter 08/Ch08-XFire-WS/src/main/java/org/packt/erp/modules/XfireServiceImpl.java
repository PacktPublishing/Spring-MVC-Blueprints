package org.packt.erp.modules;

import java.util.ArrayList;
import java.util.List;

public class XfireServiceImpl implements XfireService {
	 public String getMessage(String username) {
		    return "Hello " + username + "! from spring web service.";
		  }
	 
	 public Person[] getAllPersons(){
		 
		 Person p1 = new Person();
		 p1.setLastName("sdfdf");
		 p1.setLastName("dfgdfg");
		 p1.setAge(343);
		 
		Person[] records = new Person[5];
		 records[0] = p1;
		 return records;
	 }

}
