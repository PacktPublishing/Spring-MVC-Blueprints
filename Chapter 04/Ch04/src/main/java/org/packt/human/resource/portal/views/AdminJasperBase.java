package org.packt.human.resource.portal.views;

import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import org.packt.human.resource.portal.model.data.HrmsLogin;

public class AdminJasperBase implements JRDataSource {
	
	private List<HrmsLogin> userList;
	
	private int index = -1;
	
	public AdminJasperBase(List<HrmsLogin> userList)	{
		super();
		this.userList = userList;
	}
	


	@Override
	public Object getFieldValue(JRField field) throws JRException	{
		HrmsLogin user = userList.get(index);
		
		if(field.getName().equals("empId"))		{
			return user.getHrmsEmployeeDetails().getEmpId()+"";
		}
		else if(field.getName().equals("username"))		{
			return user.getUsername();
		}
		else if(field.getName().equals("password"))		{
			return user.getPassword();
		}
		else if(field.getName().equals("role"))		{
			return user.getRole();
		}
		return null;
	}

	@Override
	public boolean next() throws JRException{
		if(index < userList.size()-1)		{
			index++;
			return true;
		}
		return false;
	}
}
