package com.example.demo.controller; 

import java.util.List;

import com.example.demo.service.CourseEnrollmentService;
import com.example.demo.service.CourseService;
import com.example.demo.model.Course;
import com.example.demo.model.CourseEnrollment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CourseEnrollmentController {
	
	@Autowired
	private CourseEnrollmentService courseEnrollmentService;
    @Autowired
    private CourseService courseService;
	
	@RequestMapping("/admin/courseIdEnrolled/{id}")
	public List<CourseEnrollment> getAllCourseIds(@PathVariable String id) {
		return courseEnrollmentService.getAllCoursesIdByEmpId(id);
	}
    @GetMapping("/enrolledCourses/{id}")
	public List<Course> getAllCourse(@PathVariable String id) {
		return courseEnrollmentService.getAllCoursesByCourseId(id);
	}

}