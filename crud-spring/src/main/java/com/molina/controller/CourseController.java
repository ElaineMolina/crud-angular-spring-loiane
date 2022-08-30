package com.molina.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.molina.model.Course;
import com.molina.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
     
     private final CourseRepository courseRepository;

     public CourseController(CourseRepository courseRepository) {
          this.courseRepository = courseRepository;
     }

     @GetMapping
     public @ResponseBody List<Course> findAll(){
          return courseRepository.findAll();
     }
     
}
