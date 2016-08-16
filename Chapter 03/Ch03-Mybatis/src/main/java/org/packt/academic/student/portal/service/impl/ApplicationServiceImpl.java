package org.packt.academic.student.portal.service.impl;
import java.util.List;

import org.packt.academic.student.portal.mapper.ApplicationMapper;
import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.model.data.Level;
import org.packt.academic.student.portal.model.data.Semester;
import org.packt.academic.student.portal.model.data.Status;
import org.packt.academic.student.portal.model.data.Tblregistration;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.packt.academic.student.portal.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	private ApplicationMapper applicationMapper;  
	
	@Transactional
	public void saveApplication(Application form) {
		Tblregistration registration = new Tblregistration();
		
		registration.setFirstName(form.getFirstName());
		registration.setMiddleName(form.getMidName());
		registration.setLastName(form.getLastName());
		registration.setBirthDate(form.getBirthDate());
		registration.setGender(form.getGender());
		registration.setMobile(form.getMobile());
		registration.setEmail(form.getEmail());
		registration.setAddress(form.getAddress());
		registration.setUsername(form.getUsername());
		registration.setPassword(form.getPassword());
		
		applicationMapper.setPendingApp(registration);
		
	}

	
	public List<Tblregistration> retrieveApplication() {
		
		return applicationMapper.getPendingApp();
	}

	
	public Tblregistration retrieveProfile(Integer regId) {
		
		return applicationMapper.getPending(regId);
	}

	
	public boolean hasApplied(Integer regId) {
		Tblregistration applicant = applicationMapper.getPending(regId);
		if(applicant == null){
		    return false;	
		}
		return true;
	}

	@Transactional
	public void registerApplication(Tblregistration application) {
		Tblstudents student = new Tblstudents();
		
		
		
		student.setFirstName(application.getFirstName());
		student.setMiddleName(application.getMiddleName());
		student.setLastName(application.getLastName());
		student.setBirthDate(application.getBirthDate());
		student.setGender(application.getGender());
		student.setMobile(application.getMobile());
		student.setEmail(application.getEmail());
		student.setAddress(application.getAddress());
		student.setDegree("");
		Level level = new Level();
		level.setLevel(0);
		student.setLevel(level);
		Semester sem = new Semester();
		sem.setSemester(0);
		student.setSemester(sem);
		Status status = new Status();
		status.setStatus(0);
		student.setStatus(status);
		applicationMapper.setRegister(student);
		applicationMapper.deletePending(application);
	}

	@Transactional
	public void removePending(Tblregistration application) {
		applicationMapper.deletePending(application);
		
	}

	@Transactional
	public void enableAccount(Application form) {
		Tblstudentuser user = new Tblstudentuser();
		user.setUsername(form.getUsername());
		user.setPassword(form.getUsername());
		applicationMapper.setStudentAccount(user);
		
	}
	
	

}
