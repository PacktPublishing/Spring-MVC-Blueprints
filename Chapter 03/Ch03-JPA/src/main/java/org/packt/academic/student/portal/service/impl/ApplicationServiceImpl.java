package org.packt.academic.student.portal.service.impl;

import java.util.List;

import org.packt.academic.student.portal.dao.ApplicationDao;
import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.model.data.Level;
import org.packt.academic.student.portal.model.data.Semester;
import org.packt.academic.student.portal.model.data.Status;
import org.packt.academic.student.portal.model.data.Tblregistration;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.packt.academic.student.portal.service.ApplicationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationDao applicationDao;
	
	
	public ApplicationDao getApplicationDao() {
		return applicationDao;
	}

	public void setApplicationDao(ApplicationDao applicationDao) {
		this.applicationDao = applicationDao;
	}

	@Transactional
	@Override
	public void saveApplication(Application application) {
		Tblregistration reg = new Tblregistration();
		reg.setBirthDate(application.getBirthDate());
		reg.setAddress(application.getAddress());
		reg.setEmail(application.getEmail());
		reg.setFirstName(application.getFirstName());
		reg.setGender(application.getGender());
		reg.setLastName(application.getLastName());
		reg.setMiddleName(application.getMidName());
		reg.setMobile(application.getMobile());
		reg.setPassword(application.getPassword());
		reg.setRegId(application.getRegId());
		reg.setUsername(application.getUsername());
		applicationDao.setPendingApp(reg);

	}


	
	@Override
	public List<Tblregistration> retrieveApplication() {
		// TODO Auto-generated method stub
		return applicationDao.getPendingApp();
	}



	@Override
	public Tblregistration retrieveProfile(Integer regId) {
		// TODO Auto-generated method stub
		return applicationDao.getPending(regId);
	}


	
	@Override
	public boolean hasApplied(Integer regId) {
		Tblregistration profile = applicationDao.getPending(regId);
		if(profile == null){
			return false;
		}
		return true;
	}


	@Transactional
	@Override
	public void registerApplication(Tblregistration application) {
		
		
		Tblstudents student = new Tblstudents();
		student.setAddress(application.getAddress());
		student.setBirthDate(application.getBirthDate());
		student.setDegree("");
		student.setEmail(application.getEmail());
		student.setFirstName(application.getFirstName());
		student.setGender(application.getGender());
		student.setLastName(application.getLastName());
		Level level = new Level();
		level.setLevel(0);
		student.setLevel(level);
		student.setMiddleName(application.getMiddleName());
		student.setMobile(application.getMobile());
		Semester semester = new Semester();
		semester.setSemester(0);
		student.setSemester(semester);
		Status status = new Status();
		status.setStatus(0);
		student.setStatus(status);
		student.setUsername(application.getUsername());
		
		applicationDao.setRegister(student);
		applicationDao.deletePending(application);

	}


	@Transactional
	@Override
	public void removePending(Tblregistration application) {
			
		applicationDao.deletePending(application);
		
	}


	@Transactional
	@Override
	public void enableAccount(Application application) {
		Tblstudentuser studUser = new Tblstudentuser();
		studUser.setUsername(application.getUsername());
		studUser.setPassword(application.getPassword());
		applicationDao.setStudentAccount(studUser);
		
	}

}
