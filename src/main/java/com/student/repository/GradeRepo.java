package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Grade;

public interface GradeRepo extends JpaRepository<Grade,String > {

}
