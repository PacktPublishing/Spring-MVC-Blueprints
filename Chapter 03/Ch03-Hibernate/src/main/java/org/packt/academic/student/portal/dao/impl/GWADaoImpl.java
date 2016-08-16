package org.packt.academic.student.portal.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.packt.academic.student.portal.dao.GWADao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblgpa;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class GWADaoImpl implements GWADao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Tblstudentgrades> getStudentGrade(int studId) {
		System.out.println("gwa studentId: " + studId);
		Session session = this.sessionFactory.getCurrentSession();
		Tblstudentgrades g = new Tblstudentgrades();
		
		Criteria crit = session.createCriteria(Tblstudentgrades.class);
		crit.add(Restrictions.like("tblstudents.studentId",studId));
	//	crit.addOrder(Order.asc("tblcourses.courseCode"));
		crit.addOrder(Order.asc("level"));
		crit.addOrder(Order.asc("semester"));
		List<Tblstudentgrades> grades = crit.list();
		for(Tblstudentgrades go : grades){
			Tblcourses course = go.getTblcourses();
			System.out.println("dao" + course.getCourseCode());
			System.out.println("dao" +course.getCourseName());
		}
		System.out.println(grades.size());
		    
	    return grades;
	}
	
	@Transactional
	@Override
	public void setStudentGrade(Tblstudentgrades enrolledCourse) {
        Session session = sessionFactory.openSession();
        session.persist(enrolledCourse);
        session.getTransaction().commit();


	}

	@Transactional
	@Override
	public void setGWA(Tblgpa gpa) {
		
			Session session = sessionFactory.openSession();
			 System.out.println("studentId"+gpa.getStudentId());
			 System.out.println("studentId"+gpa.getGpaCalculated());
			 System.out.println("studentId"+gpa.getTblstudents().getStudentId());
	        session.persist(gpa);
	        session.getTransaction().commit();

		
		
		
	}

}
