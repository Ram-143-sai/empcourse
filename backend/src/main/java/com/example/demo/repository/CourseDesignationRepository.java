package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.demo.model.*;

public interface CourseDesignationRepository extends JpaRepository<CourseDesignation, String> {
    
    public List<Course> findByCourseId(String courseId);
    
    public List<CourseDesignation> findAllCourseIdByDesignationLevel(int designationLevel);
}
