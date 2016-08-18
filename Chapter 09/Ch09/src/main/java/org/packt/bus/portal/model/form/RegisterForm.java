package org.packt.bus.portal.model.form;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.RemoteProperty;

@DataTransferObject(type="bean", javascript="registerForm")
public class RegisterForm {
	
	@RemoteProperty
	private String firstName;
	@RemoteProperty
	private String middleName;
	@RemoteProperty
	private String lastName;
	@RemoteProperty
	private Integer age;
	@RemoteProperty
	private String username;
	@RemoteProperty
	private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
