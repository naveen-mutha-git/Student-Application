package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course {

    @Id
    private String id;

    private String courseName;

	public String getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Course(String id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}
   
    
}