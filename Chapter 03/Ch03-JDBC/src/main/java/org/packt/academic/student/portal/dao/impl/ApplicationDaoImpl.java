package org.packt.academic.student.portal.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.packt.academic.student.portal.dao.ApplicationDao;
import org.packt.academic.student.portal.model.data.Application;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	
	
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void setPendingApp(Application application) {
		String sql = "INSERT INTO tblRegistration (firstName, middleName, lastName, birthDate, "
				+ "                       gender, address, mobile, email, username, password)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, application.getFirstName(), application.getMidName(), application.getLastName(),
        		application.getBirthDate(), application.getGender(), application.getAddress(), application.getMobile(), application.getEmail(), application.getUsername(), application.getPassword());

	}

	@Override
	public List<Application> getPendingApp() {
		String sql = "SELECT * FROM tblRegistration";
		
		List<Application> listPending = jdbcTemplate.query(sql, new RowMapper<Application>() {
			 
	        @Override
	        public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Application application = new Application();
	 
	        	application.setRegId(rs.getInt("regId"));
	        	application.setFirstName(rs.getString("firstName"));
	            application.setMidName(rs.getString("middleName"));
	            application.setLastName(rs.getString("lastName"));
	            application.setBirthDate(rs.getDate("birthDate"));
	            application.setGender(rs.getString("gender"));
	            application.setAddress(rs.getString("address"));
	            application.setMobile(rs.getString("mobile"));
	            application.setEmail(rs.getString("email"));
	            return application;
	        }
	 
	    });
	    
	    return listPending;
	    
	}

	@Override
	public Application getPending(Integer regId) {
		String sql = "SELECT * FROM tblRegistration WHERE regId = ?";
		
		return jdbcTemplate.queryForObject(sql, new RowMapper<Application>() {
	 
	        @Override
	        public Application mapRow(ResultSet rs, int rowNum) throws SQLException{
	            
	            	Application application = new Application();
	            	application.setRegId(rs.getInt("regId"));
		        	application.setFirstName(rs.getString("firstName"));
		            application.setMidName(rs.getString("middleName"));
		            application.setLastName(rs.getString("lastName"));
		            application.setBirthDate(rs.getDate("birthDate"));
		            application.setGender(rs.getString("gender"));
		            application.setAddress(rs.getString("address"));
		            application.setMobile(rs.getString("mobile"));
		            application.setEmail(rs.getString("email"));
		            application.setUsername(rs.getString("username"));
		            application.setPassword(rs.getString("password"));
	                return application;

	        }
	 
	    }, regId);
	   
		/*
	    return jdbcTemplate.query(sql, new ResultSetExtractor<Application>() {
	 
	        @Override
	        public Application extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	Application application = new Application();
	            	application.setRegId(rs.getInt("regId"));
		        	application.setFirstName(rs.getString("firstName"));
		            application.setMidName(rs.getString("middleName"));
		            application.setLastName(rs.getString("lastName"));
		            application.setBirthDate(rs.getDate("birthDate"));
		            application.setGender(rs.getString("gender"));
		            application.setAddress(rs.getString("address"));
		            application.setMobile(rs.getString("mobile"));
		            application.setEmail(rs.getString("email"));
		            application.setUsername(rs.getString("username"));
		            application.setPassword(rs.getString("password"));
	                return application;
	            }
	 
	            return null;
	        }
	 
	    });
	    
	    */
	}

	@Override
	public void setRegister(Application application) {
		String sql = "INSERT INTO tblStudents (firstName, middleName, lastName, birthDate, "
				+ "                       gender, address, mobile, email, status, degree, level, semester, username)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, application.getFirstName(), application.getMidName(), application.getLastName(),
        		application.getBirthDate(), application.getGender(), application.getAddress(), application.getMobile(), application.getEmail(),0, "",0,0, application.getUsername());
		
	}

	@Override
	public void deletePending(Application application) {
		String sql = "DELETE FROM tblRegistration WHERE regId=?";
	    jdbcTemplate.update(sql, application.getRegId());
		
	}

	@Override
	public void setStudentAccount(Application application) {
		
		String sql = "INSERT INTO tblStudentUser (username, password) VALUES (?, ?)";
		PreparedStatementCreatorFactory psCreateFactory = new PreparedStatementCreatorFactory(sql, new int[]{Types.VARCHAR, Types.VARCHAR});
		jdbcTemplate.update(psCreateFactory.newPreparedStatementCreator(new Object[]{application.getUsername(),application.getPassword()}));
		
	}

}
