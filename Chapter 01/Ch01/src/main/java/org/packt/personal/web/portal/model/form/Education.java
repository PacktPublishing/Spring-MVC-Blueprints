/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.model.form;

public class Education {

	private String educLevel;
	private String institution;
	private String degree;
	private String specialization;
	private Integer year;

	public String getEducLevel() {
		return educLevel;
	}

	public void setEducLevel(String educLevel) {
		this.educLevel = educLevel;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
