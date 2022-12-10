package com.example.demo.service;

 
import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.*;
import com.example.demo.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseEnrollmentService {
	
	@Autowired
	private CourseEnrollmentRepository courseEnrollmentRepository;
    @Autowired
    private CourseRepository courseRepository;
	
	public List<CourseEnrollment> getAllCoursesIdByEmpId(String empId){
		List<CourseEnrollment> courseModels = new ArrayList<>();
		// courseRepository.findAll().forEach(courseModels::add);
        courseEnrollmentRepository.findAllCourseIdByEmpId(empId).forEach(courseModels::add);
		return courseModels;
		
	}

    public List<Course> getAllCoursesByCourseId(String empId){
		List<CourseEnrollment> courseModels = new ArrayList<>();
		// courseRepository.findAll().forEach(courseModels::add);
        courseEnrollmentRepository.findAllCourseIdByEmpId(empId).forEach(courseModels::add);
		List<String> cid = new ArrayList<>();
        for (CourseEnrollment ce : courseModels) {
            cid.add(ce.getCourseId());
        }
        List<Course> course = new ArrayList<>();
        for (String c : cid) {
            course.add(courseRepository.findByCourseId(c));
        }
        
        return course;
	}
	
	// public Course getCourse(String id) {
	// 	//return topics.stream().filter(t->t.getTopicId().equals(id)).findFirst().get();
	// 	return courseRepository.findById(id).filter(t->t.getCourseId().equals(id)).get();
	// }

	// public void addCourse(Course course) {
	// 	//topics.add(topic);
	// 	courseRepository.save(course);
	// }

	// public void updateCourse(Course course, String id) {
	// 	courseRepository.save(course);
	// }

	// public void deleteCourse(String id) {
	// 	courseRepository.deleteById(id);
	// }
}
