package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.repository.CourseRepository;
import com.example.demo.model.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(){
		List<Course> courseModels = new ArrayList<>();
		courseRepository.findAll().forEach(courseModels::add);
		return courseModels;
		
	}
	
	public Course getCourse(String id) {
		//return topics.stream().filter(t->t.getTopicId().equals(id)).findFirst().get();
		return courseRepository.findById(id).filter(t->t.getCourseId().equals(id)).get();
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
