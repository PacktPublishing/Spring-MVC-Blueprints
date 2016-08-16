package org.packt.academic.student.portal.dao.impl;

import org.packt.academic.student.portal.dao.ManagementDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ManagementDaoImpl implements ManagementDao {
	
private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional
	@Override
	public void setCourse(Tblcourses course) {
		String sql = "INSERT INTO tblcourses (departmentID, courseCode, courseName, courseUnit)"
                + " VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, course.getDeptId(), course.getCourseCode(), course.getCourseName(), course.getCourseUnit());
       

	}

	@Transactional
	@Override
	public void setDepartment(Tbldepartment dept) {
		String sql = "INSERT INTO tbldepartment (departmentID, departmentName)"
                + " VALUES (?, ?)";
        jdbcTemplate.update(sql, dept.getDepartmentId(), dept.getDepartmentName());

	}

	@Transactional
	@Override
	public void setStudent(Tblstudents student) {
		String sql = "INSERT INTO tblstudents (studentID, firstName, lastName, middleName, gender, birthDate, status, degree, level, semester, address, mobile, email)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, student.getStudentId(), student.getFirstName(), student.getLastName(), student.getMiddleName(), student.getGender(), student.getBirthDate(),
        		student.getStatus(), student.getDegree(), student.getLevel(), student.getLevel(), student.getAddress(), student.getMobile(), student.getEmail());

	}

	@Transactional
	@Override
	public void setFaculty(Tblfaculty faculty, String username) {
		String sql = "INSERT INTO tblfaculty (facultyId, firstName, lastName, middleName, departmentId, username)"
                + " VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, faculty.getFacultyId(), faculty.getFirstName(), faculty.getLastName(), faculty.getMiddleName(), faculty.getDeptId(), username);

	}

	@Override
	public void setFacultyLogin(Tblfacultyuser facultyUser) {
		String sql = "INSERT INTO tblfacultyuser (username, password)"
                + " VALUES (?, ?)";
        jdbcTemplate.update(sql, facultyUser.getUsername(), facultyUser.getPassword());
		
	}

}
