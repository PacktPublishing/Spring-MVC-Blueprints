package org.packt.academic.student.portal.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.packt.academic.student.portal.dao.EnrollmentDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class EnrollmentDaoImpl implements EnrollmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tblcourses> getCourses() {
		
		Session session = this.sessionFactory.getCurrentSession();
		List<Tblcourses> courseList = session.createQuery("from Tblcourses").list();
		    
	    return courseList;
	    
	}

	@Override
	public List<Tblfaculty> getFaculty() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Tblfaculty> facultyList = session.createQuery("from Tblfaculty").list();
		    
	    return facultyList;
	}

	@Transactional
	@Override
	public void setCourse(Tblstudentgrades enrolledCourse) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(enrolledCourse);
        transaction.commit();
        session.close();

	}

	@Transactional
	@Override
	public void setStudentGrade(Tblstudentgrades grade) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(grade);
        transaction.commit();
        session.close();
		
	}

	@Override
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId) {
       //  String sql = "SELECT c.studentID, c.courseCode, c.grade, c.semester, c.level, c.facultyId, s.studentID, s.firstName, s.lastName, s.middleName, s.gender, s.status, s.degree  "
       //  		+ "FROM tblstudents s INNER JOIN tblstudentgrades c ON s.studentID = c.studentID where c.facultyId = " + facultyId;
		Session session = this.sessionFactory.getCurrentSession();
		List<Tblstudents> facultyList = session.createQuery("from Tblstudents").list();
		Iterator<Tblstudents> iterator = facultyList.iterator();
		List<JoinStudCourseTakenForm> joinData = new ArrayList<>();
		while(iterator.hasNext()){
			Tblstudents student = iterator.next();
			Iterator<Tblstudentgrades> iterateCourse = student.getTblstudentgradeses().iterator();
			while(iterateCourse.hasNext()){
				Tblstudentgrades grade = iterateCourse.next();
				if(grade.getFacultyId() == facultyId){
					JoinStudCourseTakenForm join = new JoinStudCourseTakenForm();
					join.setCourseCode(grade.getTblcourses().getCourseCode());
	        		join.setGrade(grade.getGrade());
	        		join.setSemester(grade.getSemester());
	        		join.setLevel(grade.getLevel());
	        		join.setFacultyId(grade.getFacultyId());
	        		
	        		join.setStudentId(grade.getTblstudents().getStudentId());
	        		join.setFirstName(grade.getTblstudents().getFirstName());
	        		join.setLastName(grade.getTblstudents().getLastName());
	        		join.setMiddleName(grade.getTblstudents().getMiddleName());
	        		join.setGender(grade.getTblstudents().getGender());
	        		join.setStatus(grade.getTblstudents().getStatus().getStatus());
	        		join.setDegree(grade.getTblstudents().getDegree());
	        		joinData.add(join);
				}
			}
		}
		
	    return joinData;
	}

	@Override
	public List<Tblstudentgrades> getStudentList(int facultyId) {
       
        Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Tblstudentgrades.class);
		crit.add(Restrictions.like("facultyId",facultyId));
		crit.addOrder(Order.asc("courseCode"));
		crit.addOrder(Order.asc("level"));
		crit.addOrder(Order.asc("semester"));
		List<Tblstudentgrades> grades = crit.list();
	    return grades;
	}

}
