package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="profile")
public class Profile {

    @Id
    private  String id;
    private String name;
    private String address;
    private String phone;
    private String gender;
    private String course;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getGender() {
		return gender;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
		
	}
	public Profile(String id, String name, String address, String phone, String gender , String course) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.course=course;
		
	}
	public Profile() {
		super();
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", gender="
				+ gender + ", course=" + course + "]";
	}
	
    
    
    
}