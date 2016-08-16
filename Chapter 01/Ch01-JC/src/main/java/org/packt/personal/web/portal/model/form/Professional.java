package org.packt.personal.web.portal.model.form;

import java.util.List;

public class Professional {
	
	private String position;
	private String company;
	private Integer years;
	private String location; 
	private List<String> skillSets;
	private List<String> prevJobs;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getSkillSets() {
		return skillSets;
	}
	public void setSkillSets(List<String> skillSets) {
		this.skillSets = skillSets;
	}
	public List<String> getPrevJobs() {
		return prevJobs;
	}
	public void setPrevJobs(List<String> prevJobs) {
		this.prevJobs = prevJobs;
	}
	
	

}
