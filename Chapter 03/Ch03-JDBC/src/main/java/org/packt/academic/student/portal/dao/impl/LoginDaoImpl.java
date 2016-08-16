package org.packt.academic.student.portal.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.packt.academic.student.portal.dao.LoginDao;
import org.packt.academic.student.portal.model.data.Login;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {
	
private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Login getStudentUser(Login login) {
		String sql = "SELECT * FROM tblStudentUser WHERE username='" + login.getUserName() + "'";
	    return jdbcTemplate.query(sql, new ResultSetExtractor<Login>() {
	 
	        @Override
	        public Login extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	Login login = new Login();
	            	login.setUserName(rs.getString("username"));
	            	login.setPassWord(rs.getString("password"));
	                return login;
	            }
	 
	            return null;
	        }
	 
	    });
	}

	@Override
	public Login getFacultyUser(Login login) {
		String sql = "SELECT * FROM tblFacultyUser WHERE username='" + login.getUserName() + "'";
	    return jdbcTemplate.query(sql, new ResultSetExtractor<Login>() {
	 
	        @Override
	        public Login extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	Login login = new Login();
	            	login.setUserName(rs.getString("username"));
	            	login.setPassWord(rs.getString("password"));
	                return login;
	            }
	 
	            return null;
	        }
	 
	    });
	}

	@Override
	public Login getAdmin(Login login) {
		String sql = "SELECT * FROM tblAdminUser WHERE username='" + login.getUserName() + "'";
	    return jdbcTemplate.query(sql, new ResultSetExtractor<Login>() {
	 
	        @Override
	        public Login extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	Login login = new Login();
	            	login.setUserName(rs.getString("username"));
	            	login.setPassWord(rs.getString("password"));
	                return login;
	            }
	 
	            return null;
	        }
	 
	    });
	}
	
	
}
