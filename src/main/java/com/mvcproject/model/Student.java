package com.mvcproject.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {

	
	 @Pattern(regexp="[^0-9]*")
	 @NotEmpty
	 private String studentName;
	 @Size(min=2,max=30)
	 private String studentHobby;
	 private Long studentMobile;
	 @Past
	 private Date studentDOB;
	 private ArrayList<String> studentSkills;	 
	 /*
	  * Spring binds the user defined type
	  */
	 private Address studentAddress;
	 
	 
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentHobby() {
		return studentHobby;
	}
	
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}	 
	
	public Long getStudentMobile() {
		return studentMobile;
	}
	
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	public Date getStudentDOB() {
		return studentDOB;
	}
	
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

}
