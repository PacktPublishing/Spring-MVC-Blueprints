package org.packt.academic.student.portal.model.form;

public class CourseForm {
	
	private String courseCode;
	private int deptId;
	private String courseName;
	private int courseUnit;
	
	public int getCourseUnit() {
		return courseUnit;
	}
	public void setCourseUnit(int courseUnit) {
		this.courseUnit = courseUnit;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
