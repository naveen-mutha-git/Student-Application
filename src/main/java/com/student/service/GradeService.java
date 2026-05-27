package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Grade;
import com.student.repository.GradeRepo;

@Service
public class GradeService {

    @Autowired
    private GradeRepo gradeRepo;

    public Grade saveGrade(Grade grade) {
        return gradeRepo.save(grade);
    }

    public List<Grade> getAllGrades() {
        return gradeRepo.findAll();
    }

    public Optional<Grade> getGradeById(String id) {
        return gradeRepo.findById(id);
    }

    public Grade updateGrade(String id, String grade) {

        Grade grade1 = gradeRepo.findById(id).get();

        grade1.setId(grade1.getId());
        grade1.setSubject(grade1.getSubject());
        grade1.setMarks(grade1.getMarks());
        
        grade1.setGrade(grade1.getGrade());

        
        return gradeRepo.save(grade1);
    }
    

    public String deleteGrade(String id) {
        gradeRepo.deleteById(id);
        return "Grade deleted successfully";
    }
}