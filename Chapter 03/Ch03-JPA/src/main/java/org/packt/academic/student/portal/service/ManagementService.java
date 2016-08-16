package org.packt.academic.student.portal.service;

import org.packt.academic.student.portal.model.form.CourseForm;
import org.packt.academic.student.portal.model.form.DepartmentForm;
import org.packt.academic.student.portal.model.form.FacultyForm;
import org.packt.academic.student.portal.model.form.StudentForm;

public interface ManagementService {

	public void addCourse(CourseForm course);
	public void addDepartment(DepartmentForm dept);
	public void addStudent(StudentForm student);
	public void addFaculty(FacultyForm faculty);
	
}
