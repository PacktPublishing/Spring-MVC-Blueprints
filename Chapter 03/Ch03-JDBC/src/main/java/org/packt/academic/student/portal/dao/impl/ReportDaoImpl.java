package org.packt.academic.student.portal.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.packt.academic.student.portal.dao.ReportDao;
import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReportDaoImpl implements ReportDao {


	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Transactional
	@Override
	public List<Tblcourses> getCourses() {
        String sql = "SELECT * FROM tblcourses";
		
		List<Tblcourses> courses = jdbcTemplate.query(sql, new RowMapper<Tblcourses>() {
			 
	        @Override
	        public Tblcourses mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Tblcourses course = new Tblcourses();
	 
	        	course.setDeptId(rs.getInt("departmentID"));
	        	course.setCourseCode(rs.getString("courseCode"));
	            course.setCourseName(rs.getString("courseName"));
	            course.setCourseUnit(rs.getInt("courseUnit"));
	           
	            return course;
	        }
	 
	    });
	    
	    return courses;
	}

	
	@Transactional
	@Override
	public List<Tblfaculty> getFaculty() {
         String sql = "SELECT * FROM tblfaculty";
		
		 List<Tblfaculty> faculty = jdbcTemplate.query(sql, new RowMapper<Tblfaculty>() {
			 
	     @Override
	     public Tblfaculty mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Tblfaculty faculty = new Tblfaculty();
	 
	        	faculty.setDeptId(rs.getInt("departmentId"));
	        	faculty.setFacultyId(rs.getInt("facultyId"));
	            faculty.setFirstName(rs.getString("firstName"));
	            faculty.setLastName(rs.getString("lastName"));
	            faculty.setMiddleName(rs.getString("middleName"));
	            return faculty;
	        }
	 
	    });
	    
	    return faculty;
	}

	
	@Transactional
	@Override
	public List<Tbldepartment> getDepartment() {
        String sql = "SELECT * FROM tbldepartment";
		
		List<Tbldepartment> dept = jdbcTemplate.query(sql, new RowMapper<Tbldepartment>() {
			 
	    @Override
	    public Tbldepartment mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	   Tbldepartment dept = new Tbldepartment();
	 
	        	dept.setDepartmentId(rs.getInt("departmentID"));
	        	dept.setDepartmentName(rs.getString("departmentName"));
	          	           
	            return dept;
	        }
	 
	    });
	    
	    return dept;
	}
	
	
	
	@Override
	public Tblstudents getStudentId(String username) {
		String sql = "SELECT * FROM tblstudents WHERE username LIKE ?";
		
		return jdbcTemplate.queryForObject(sql, new RowMapper<Tblstudents>() {
	 
	        @Override
	        public Tblstudents mapRow(ResultSet rs, int rowNum) throws SQLException{
	            
	        	    Tblstudents student = new Tblstudents();
	        	  
	        	    student.setFirstName(rs.getString("firstName"));
	        	    student.setMiddleName(rs.getString("middleName"));
	        	    student.setLastName(rs.getString("lastName"));
	        	    student.setBirthDate(rs.getDate("birthDate"));
	        	    student.setGender(rs.getString("gender"));
	        	    student.setAddress(rs.getString("address"));
	        	    student.setMobile(rs.getString("mobile"));
	        	    student.setEmail(rs.getString("email"));
	        	    student.setStudentId(rs.getInt("studentID"));
	                return student;

	        }
	 
	    }, username);
	   
	}

	@Override
	public Tblfaculty getFacultyId(String username) {
        String sql = "SELECT * FROM tblfaculty WHERE username LIKE ?";
		
		return jdbcTemplate.queryForObject(sql, new RowMapper<Tblfaculty>() {
	 
	        @Override
	        public Tblfaculty mapRow(ResultSet rs, int rowNum) throws SQLException{
	            
	        	Tblfaculty faculty = new Tblfaculty();
	        	  
	        	faculty.setFirstName(rs.getString("firstName"));
	        	faculty.setMiddleName(rs.getString("middleName"));
	        	faculty.setLastName(rs.getString("lastName"));
	        	faculty.setFacultyId(rs.getInt("facultyId"));
	        	faculty.setDeptId(rs.getInt("departmentId"));
	        	  
	             return faculty;

	        }
	 
	    }, username);
	   
	}

}
