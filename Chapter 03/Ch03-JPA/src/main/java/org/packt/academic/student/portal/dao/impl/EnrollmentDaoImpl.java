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

import org.packt.academic.student.portal.dao.EnrollmentDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class EnrollmentDaoImpl implements EnrollmentDao {
	
	@PersistenceContext
	private EntityManager entityManagerFactory;
	
	@Override
	public List<Tblcourses> getCourses() {
		String qlString = "SELECT b FROM Tblcourses b";
		TypedQuery<Tblcourses> query = entityManagerFactory.createQuery(qlString, Tblcourses.class);
		
		return query.getResultList();
		
		
	    
	}

	@Override
	public List<Tblfaculty> getFaculty() {
		String qlString = "SELECT b FROM Tblfaculty b";
		TypedQuery<Tblfaculty> query = entityManagerFactory.createQuery(qlString, Tblfaculty.class);
		
		return query.getResultList();
		
		
	}

	@Transactional
	@Override
	public void setCourse(Tblstudentgrades enrolledCourse) {
		entityManagerFactory.persist(enrolledCourse);
		entityManagerFactory.flush();

	}

	@Transactional
	@Override
	public void setStudentGrade(Tblstudentgrades grade) {
		entityManagerFactory.persist(grade);
		entityManagerFactory.flush();
		
	}

	@Override
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId) {
       //  String sql = "SELECT c.studentID, c.courseCode, c.grade, c.semester, c.level, c.facultyId, s.studentID, s.firstName, s.lastName, s.middleName, s.gender, s.status, s.degree  "
       //  		+ "FROM tblstudents s INNER JOIN tblstudentgrades c ON s.studentID = c.studentID where c.facultyId = " + facultyId;
		String qlString = "SELECT b FROM Tblstudents b";
		TypedQuery<Tblstudents> query = entityManagerFactory.createQuery(qlString, Tblstudents.class);
		Iterator<Tblstudents> iterator = query.getResultList().iterator();
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
		   CriteriaBuilder criteriaBuilder = entityManagerFactory.getCriteriaBuilder();
		   CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		   Root<Tblstudentgrades> from = criteriaQuery.from(Tblstudentgrades.class);
		   CriteriaQuery<Object> select1 = criteriaQuery.select(from);
		   select1.orderBy(criteriaBuilder.asc(from.get("courseCode")),criteriaBuilder.asc(from.get("level")),criteriaBuilder.asc(from.get("semester")));
		   TypedQuery<Object> typedQuery = entityManagerFactory.createQuery(select1);
		   Iterator<Object> iterate = typedQuery.getResultList().iterator();
		   List<Tblstudentgrades> gradeList = new ArrayList<>();
		   while(iterate.hasNext()){
			   Tblstudentgrades grade = (Tblstudentgrades) iterate.next();
			   gradeList.add(grade);
			  
		   }
		   return gradeList;
       
	}

}
