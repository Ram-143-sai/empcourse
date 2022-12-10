package com.example.demo.service; 

 
import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.*;
import com.example.demo.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseDesignationService {
	
	@Autowired
	private CourseDesignationRepository courseDesignationRepository;
    @Autowired
    private CourseRepository courseRepository;
	@Autowired
    private EmployeeRepository employeeRepository;
	
	

    public List<Course> getAllCoursesByDes(int designationLevel){
		List<CourseDesignation> courseModels = new ArrayList<>();
		// courseRepository.findAll().forEach(courseModels::add);
        courseDesignationRepository.findAllCourseIdByDesignationLevel(designationLevel).forEach(courseModels::add);
		List<String> cid = new ArrayList<>();
        for (CourseDesignation ce : courseModels) {
            cid.add(ce.getCourseId());
        }
        List<Course> course = new ArrayList<>();
        for (String c : cid) {
            course.add(courseRepository.findByCourseId(c));
        }
        
        return course;
	}

	public List<Course> getAvaialbleCoursesForEmp(String empId){
		Employee e;
		e= employeeRepository.findByEmpId(empId);
		int dsl;
		dsl= e.getDesignationLevel();
		List<CourseDesignation> courseModels = new ArrayList<>();
		// courseRepository.findAll().forEach(courseModels::add);
        courseDesignationRepository.findAllCourseIdByDesignationLevel(dsl).forEach(courseModels::add);
		List<String> cid = new ArrayList<>();
        for (CourseDesignation ce : courseModels) {
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
