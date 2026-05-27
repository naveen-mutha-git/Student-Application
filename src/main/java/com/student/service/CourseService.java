package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Course;
import com.student.repository.CourseRepo;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course updateCourse(String id, Course courseDetails) {
        Course course = courseRepo.findById(id).get();

        course.setCourseName(courseDetails.getCourseName());
        

        return courseRepo.save(course);
    }

    public String deleteCourse(String id) {
        courseRepo.deleteById(id);
        return "Course deleted successfully";
    }
}