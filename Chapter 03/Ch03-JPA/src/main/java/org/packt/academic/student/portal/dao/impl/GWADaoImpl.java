package org.packt.academic.student.portal.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.packt.academic.student.portal.dao.GWADao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblgpa;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class GWADaoImpl implements GWADao {
	
	@PersistenceContext
	private EntityManager entityManagerFactory;

	@Override
	public List<Tblstudentgrades> getStudentGrade(int studId) {
		   CriteriaBuilder criteriaBuilder = entityManagerFactory.getCriteriaBuilder();
		   CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		   Root<Tblstudentgrades> from = criteriaQuery.from(Tblstudentgrades.class);
		   criteriaQuery.where(criteriaBuilder.equal(
		            from.get("tblstudents").get("studentId"), studId));
		   CriteriaQuery<Object> select1 = criteriaQuery.select(from);
		   select1.orderBy(criteriaBuilder.asc(from.get("level")),criteriaBuilder.asc(from.get("semester")));
		   TypedQuery<Object> typedQuery = entityManagerFactory.createQuery(select1);
		   Iterator<Object> iterate = typedQuery.getResultList().iterator();
		   List<Tblstudentgrades> gradeList = new ArrayList<>();
		   while(iterate.hasNext()){
			   Tblstudentgrades grade = (Tblstudentgrades) iterate.next();
			   System.out.println("student"+grade.getId());
			   gradeList.add(grade);
		   }
		  for(Tblstudentgrades go : gradeList){
			Tblcourses course = go.getTblcourses();
			System.out.println("dao" + course.getCourseCode());
			System.out.println("dao" +course.getCourseName());
		  }
	System.out.println(gradeList.size());
		    
	    return gradeList;
	}
	
	@Transactional
	@Override
	public void setStudentGrade(Tblstudentgrades enrolledCourse) {
		 System.out.println("student" + enrolledCourse.getId());
		entityManagerFactory.persist(enrolledCourse);
	}

	@Transactional
	@Override
	public void setGWA(Tblgpa gpa) {
		entityManagerFactory.persist(gpa);
		entityManagerFactory.flush();

		
		
		
	}

}
