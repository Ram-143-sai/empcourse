package com.example.demo.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;

@Repository
public interface CourseRepository  extends JpaRepository<Course, String> {

    Course findByCourseId(String courseId);
    List<Course> findAllCourseByCourseId(String courseId);
}
