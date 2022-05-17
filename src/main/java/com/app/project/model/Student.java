package com.app.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gftc", catalog= "liv2train")
public class Student {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private int Center_id;
     private String CenterName;
     private String CenterCode;
     private String Address;
     private String DetailedAddress;
     private String City;
     private String State;
     private int Pincode;
     private int StudentCapacity;
     private String CourseOffered;
     private String ContactEmail;
     private String CreatedOn;
     private String ContactPhone;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int Center_id,String centerName, String centerCode, String address, String detailedAddress, String city,
			String state, int pincode, int studentCapacity, String courseOffered, String contactEmail, String createdOn,
			String contactPhone) {
		super();
		this.Center_id=Center_id;
		CenterName = centerName;
		CenterCode = centerCode;
		Address = address;
		DetailedAddress = detailedAddress;
		City = city;
		State = state;
		Pincode = pincode;
		StudentCapacity = studentCapacity;
		CourseOffered = courseOffered;
		ContactEmail = contactEmail;
		CreatedOn = createdOn;
		ContactPhone = contactPhone;
	}
	public int getId() {
		return Center_id;
	}
	public void setId(int Center_id) {
		this.Center_id = Center_id;
	}
	public String getCenterName() {
		return CenterName;
	}
	public void setCenterName(String centerName) {
		CenterName = centerName;
	}
	public String getCenterCode() {
		return CenterCode;
	}
	public void setCenterCode(String centerCode) {
		CenterCode = centerCode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDetailedAddress() {
		return DetailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		DetailedAddress = detailedAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public int getStudentCapacity() {
		return StudentCapacity;
	}
	public void setStudentCapacity(int studentCapacity) {
		StudentCapacity = studentCapacity;
	}
	public String getCourseOffered() {
		return CourseOffered;
	}
	public void setCourseOffered(String courseOffered) {
		CourseOffered = courseOffered;
	}
	public String getContactEmail() {
		return ContactEmail;
	}
	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}
	public String getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(String createdOn) {
		CreatedOn = createdOn;
	}
	public String getContactPhone() {
		return ContactPhone;
	}
	public void setContactPhone(String contactPhone) {
		ContactPhone = contactPhone;
	}
}
