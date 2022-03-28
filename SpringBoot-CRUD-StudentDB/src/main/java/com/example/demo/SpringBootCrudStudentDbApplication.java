package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories


public class SpringBootCrudStudentDbApplication implements CommandLineRunner{
	
	@Autowired
	PersonItemRepo Items;
	
	public static void main(String[] args) {		
		SpringApplication.run(SpringBootCrudStudentDbApplication.class, args);
	}
	
	//Create
	
	public void Create() {
		System.out.println("Data creation started...");
		Items.save(new Person("1","001","A","a","Java"));
		Items.save(new Person("2","002","B","b","Python"));
		Items.save(new Person("3","003","C","c","Java"));
		Items.save(new Person("4","004","D","d","Python"));
		System.out.println("Data creation completed...");
	}
	
	// Read
	public void getDetails(Person person) {
		System.out.println("First Name: "+person.getFirstName()+ " Last Name: "+person.getLastName()+" Roll number: "+ person.getRollNo()+ " Tech: "+ person.getTech());
	}
	
	public void showAllPeople() {
		Items.findAll().forEach(item -> getDetails(item));
	}
	
	public void findpersonbyRollno(String rollNo) {
		System.out.println("Finding the person with Roll number: " + rollNo);
		Person person = Items.findbyRollNo(rollNo);
		getDetails(person);
	}
	
	public void find1(String a, String b) {
		Person person = Items.findby(a,b);
		getDetails(person);
	}
	
	// Update


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-----------------Create---------------");
		Create();
		System.out.println("-----------------Read All---------------");
		showAllPeople();
		System.out.println("-----------------find by person---------------");
		findpersonbyRollno("001");
		System.out.println("-----------------find person by tech and rollno ---------------");
		find1("001","Java");
		
	}

}
