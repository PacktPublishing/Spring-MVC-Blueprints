package org.packt.academic.student.portal.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.packt.academic.student.portal.dao.EnrollmentDao;
import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EnrollmentDaoImpl implements EnrollmentDao {
	
    private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Tblcourses> getCourses() {
		String sql = "SELECT * FROM tblcourses";
		
		List<Tblcourses> courseList = jdbcTemplate.query(sql, new RowMapper<Tblcourses>() {
			 
	        @Override
	        public Tblcourses mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Tblcourses course = new Tblcourses();
	 
	        	course.setCourseCode(rs.getString("courseCode"));
	        	course.setCourseName(rs.getString("courseName"));
	        	course.setCourseUnit(rs.getInt("courseUnit"));
	        	course.setDeptId(rs.getInt("departmentID"));
	       
	            return course;
	        }
	 
	    });
	    
	    return courseList;
	    
	}

	@Override
	public List<Tblfaculty> getFaculty() {
		String sql = "SELECT * FROM tblfaculty";
		
		List<Tblfaculty> courseList = jdbcTemplate.query(sql, new RowMapper<Tblfaculty>() {
			 
	        @Override
	        public Tblfaculty mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Tblfaculty faculty = new Tblfaculty();
	 
	        	faculty.setFacultyId(rs.getInt("facultyId"));
	        	faculty.setDeptId(rs.getInt("departmentId"));
	        	faculty.setFirstName(rs.getString("firstName"));
	        	faculty.setLastName(rs.getString("lastName"));
	        	faculty.setMiddleName(rs.getString("middleName"));
	            return faculty;
	        }
	 
	    });
	    
	    return courseList;
	}

	@Override
	public void setCourse(Tblstudentgrades enrolledCourse) {
		String sql = "INSERT INTO tblstudentgrades (studentID, courseCode, grade, semester, "
				+ "                       level, facultyId)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, enrolledCourse.getTblstudents().getStudentId(), 
        		enrolledCourse.getTblcourses().getCourseCode(), 0.0, enrolledCourse.getSemester(), enrolledCourse.getLevel(), enrolledCourse.getFacultyId());

	}

	@Override
	public void setStudentGrade(Tblstudentgrades grade) {
		String sql = "INSERT INTO tblstudentgrades (studentID, courseCode, grade, semester, "
				+ "                       level, facultyId)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, grade.getTblstudents().getStudentId(), 
        		grade.getTblcourses().getCourseCode(), 0.0, grade.getSemester(), grade.getLevel(), grade.getFacultyId());
		
	}

	@Override
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId) {
         String sql = "SELECT c.studentID, c.courseCode, c.grade, c.semester, c.level, c.facultyId, s.studentID, s.firstName, s.lastName, s.middleName, s.gender, s.status, s.degree  "
         		+ "FROM tblstudents s INNER JOIN tblstudentgrades c ON s.studentID = c.studentID where c.facultyId = " + facultyId;
		
		List<JoinStudCourseTakenForm> joinData = jdbcTemplate.query(sql, new RowMapper<JoinStudCourseTakenForm>() {
			 
	        @Override
	        public JoinStudCourseTakenForm mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	JoinStudCourseTakenForm join = new JoinStudCourseTakenForm();
	        		join.setCourseCode(rs.getString("c.courseCode"));
	        		join.setGrade(rs.getDouble("c.grade"));
	        		join.setSemester(rs.getInt("c.semester"));
	        		join.setLevel(rs.getInt("c.level"));
	        		join.setFacultyId(rs.getInt("c.facultyId"));
	        		
	        		join.setStudentId(rs.getInt("c.studentID"));
	        		join.setFirstName(rs.getString("s.firstName"));
	        		join.setLastName(rs.getString("s.lastName"));
	        		join.setMiddleName(rs.getString("s.middleName"));
	        		join.setGender(rs.getString("s.gender"));
	        		join.setStatus(rs.getInt("s.status"));
	        		join.setDegree(rs.getString("s.degree"));
	        	
	            return join;
	        }
	 
	    });
	    
	    return joinData;
	}

	@Override
	public List<Tblstudentgrades> getStudentList(int facultyId) {
        String sql = "SELECT * FROM tblstudentgrades where facultyId = " + facultyId + " order by courseCode, level, semester";
		
		List<Tblstudentgrades> grades = jdbcTemplate.query(sql, new RowMapper<Tblstudentgrades>() {
			 
	        @Override
	        public Tblstudentgrades mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Tblstudentgrades grade = new Tblstudentgrades();
	            Tblstudents stud = new Tblstudents();
	            stud.setStudentId(rs.getInt("studentID"));
	        	grade.setTblstudents(stud);
	        	grade.setFacultyId(rs.getInt("facultyId"));
	        	grade.setGrade(rs.getDouble("grade"));
	            grade.setLevel(rs.getInt("level"));
	            grade.setSemester(rs.getInt("semester"));
	            Tblcourses course = new Tblcourses();
	            course.setCourseCode(rs.getString("courseCode"));
	            grade.setTblcourses(course);
	            return grade;
	        }
	 
	    });
	    
	    return grades;
	}

}
