package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.entity.Student;
import com.student.service.Studentservice;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private Studentservice studentservice;

    // POST - Add student
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentservice.saveStudent(student);
    }

    // GET - Get all students
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentservice.getAllStudents();
    }

    // GET - Get student by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return studentservice.getStudentById(id);
    }

    // PUT - Update student
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        return studentservice.updateStudent(id, student);
    }

    // DELETE - Delete student
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentservice.deleteStudent(id);
    }
   

    
   
        
}
