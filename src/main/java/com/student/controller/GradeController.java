package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.entity.Grade;
import com.student.service.GradeService;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    // Save grade
    @PostMapping("/save")
    public Grade saveGrade(@RequestBody Grade grade) {
        return gradeService.saveGrade(grade);
    }

    // Get all grades
    @GetMapping("/all")
    public List<Grade> getAllGrades() {
        return gradeService.getAllGrades();
    }

    // Get grade by ID
    @GetMapping("/{id}")
    public Optional<Grade> getGradeById(@PathVariable String id) {
        return gradeService.getGradeById(id);
    }

    // Update grade
    @PutMapping("/update/{id}")
    public Grade updateGrade(@PathVariable String id,@RequestBody String grade) {
        return gradeService.updateGrade(id, grade);
    }

    // Delete grade
    @DeleteMapping("/delete/{id}")
    public String deleteGrade(@PathVariable String id) {
        return gradeService.deleteGrade(id);
    }
}