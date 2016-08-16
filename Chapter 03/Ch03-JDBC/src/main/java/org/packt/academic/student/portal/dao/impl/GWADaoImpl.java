package org.packt.academic.student.portal.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.packt.academic.student.portal.dao.GWADao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;

@Repository
public class GWADaoImpl implements GWADao {
	
private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Tblstudentgrades> getStudentGrade(int studId) {
		String sql = "SELECT * FROM tblstudentgrades where studentID = " + studId + " order by courseCode, level, semester";
		
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
	
	
	@Override
	public void setStudentGrade(Tblstudentgrades enrolledCourse) {
		String sql = "UPDATE  tblstudentgrades SET grade = ?"
				+ "                        WHERE studentID = ? and courseCode like ? and facultyId = ?";
               
        jdbcTemplate.update(sql, new Object[]{enrolledCourse.getGrade(), enrolledCourse.getTblstudents().getStudentId(), enrolledCourse.getTblcourses().getCourseCode(), enrolledCourse.getFacultyId(),});

	}

	@Override
	public void setGWA(int studentId, double gpa) {
		try{
			String sql = "INSERT INTO tblgpa (studentID, gpaCalculated)"
	                + " VALUES (?, ?)";
	        jdbcTemplate.update(sql, studentId, gpa);

		}catch(Exception e){
			String sql = "UPDATE tblgpa SET gpaCalculated = ?"
	                + " where studentID = ?";
	        jdbcTemplate.update(sql, new Object[]{studentId, gpa});
		}
		
		
	}

}
