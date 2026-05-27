package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="notification")
public class Notification {

    @Id
    private String id;

    private String title;
    private String message;
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getMessage() {
		return message;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Notification(String id, String title, String message) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
	}
	public Notification() {
		super();
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", title=" + title + ", message=" + message + "]";
	}
    
}