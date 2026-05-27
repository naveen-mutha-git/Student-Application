package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepo;

@Service
public class Studentservice {

    @Autowired
    private StudentRepo studentRepo;

    // Save student
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(String id) {
        return studentRepo.findById(id);
    }

    // Update student
    public Student updateStudent(String id, Student studentDetails) {

        Student student = studentRepo.findById(id).get();

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());

        return studentRepo.save(student);
    }

    // Delete student
    public String deleteStudent(String  id) {
        studentRepo.deleteById(id);
        return "Student deleted successfully";
    }
}