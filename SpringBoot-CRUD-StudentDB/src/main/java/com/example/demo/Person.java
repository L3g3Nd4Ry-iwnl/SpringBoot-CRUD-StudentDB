package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Details")
public class Person {

  @Id 
  private String id;

  private String rollNo;
  private String firstName;
  private String lastName;
  private String tech;
  
  public Person(String id, String rollNo, String firstName, String lastName, String tech) {
	super();
	this.id = id;
	this.rollNo = rollNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.tech = tech;
  }

	public String getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTech() {
		return tech;
	}
	
	public void setTech(String tech) {
		this.tech = tech;
	}  
}