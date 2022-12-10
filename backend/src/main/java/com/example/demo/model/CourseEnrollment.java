package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// import java.util.Collection;


@Table(name = "course_enrollment")
@Entity
public class CourseEnrollment {
    

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    String empId;
    String courseId;

    public CourseEnrollment() {
		
	}
	public CourseEnrollment(String empId, String courseId) {
        super();
		this.empId = empId;
		this.courseId = courseId;
	}

    public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
    public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
