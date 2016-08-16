package org.packt.academic.student.portal.model.form;

public class AvailCourseForm implements java.io.Serializable {
	
	private boolean enroll;
	private String courseCode;
	private String courseName;
	private int courseUnit;
	private int semester;
	private int level;
	private int facultyId;
	
	public boolean isEnroll() {
		return enroll;
	}
	public void setEnroll(boolean enroll) {
		this.enroll = enroll;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseUnit() {
		return courseUnit;
	}
	public void setCourseUnit(int courseUnit) {
		this.courseUnit = courseUnit;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	

}
