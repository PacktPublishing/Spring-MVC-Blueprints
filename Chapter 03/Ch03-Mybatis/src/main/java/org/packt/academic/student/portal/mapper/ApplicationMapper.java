package org.packt.academic.student.portal.mapper;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblregistration;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.data.Tblstudentuser;


public interface ApplicationMapper {
	
	public void setPendingApp(Tblregistration registration);
	public List<Tblregistration> getPendingApp();
	
	public Tblregistration getPending(Integer regId);
	public void setRegister(Tblstudents registration);
	
	public void deletePending(Tblregistration registration);
	public void setStudentAccount(Tblstudentuser user);
	

}
