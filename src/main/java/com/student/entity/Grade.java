package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Grade")
public class Grade {
	 
	@Id
	private String id;
	private String subject;
	private int marks;
	private String grade;
	public String getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public int getMarks() {
		return marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Grade(String id, String subject, int marks, String grade) {
		super();
		this.id = id;
		this.subject = subject;
		this.marks = marks;
		this.grade = grade;
	}
	public Grade() {
		super();
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", subject=" + subject + ", marks=" + marks + ", grade=" + grade + "]";
	}
	public Object getStudentId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
