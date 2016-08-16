package org.packt.personal.web.portal.model.form;

import java.util.Date;
import java.util.List;

public class Biography {
	
	private String firstName;
	private String lastName;
	private Integer age;
	private Date birthDate;
	private String location;
	private String country;
	private List<String> hobbies;
	private List<String> readings;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getReadings() {
		return readings;
	}
	public void setReadings(List<String> readings) {
		this.readings = readings;
	}
	
	
	

}
