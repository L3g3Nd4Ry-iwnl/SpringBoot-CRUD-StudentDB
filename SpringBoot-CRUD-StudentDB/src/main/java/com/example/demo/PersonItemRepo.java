package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonItemRepo extends MongoRepository<Person, String> {
	
	@Query("{rollNo:'?0'}")
	Person findbyRollNo(String rollNo);
	
	@Query(value="{tech:'?0'}", fields="{'rollNo' : 1, 'firstName' : 1, 'lastName' : 1}")
	List<Person> findAll(String tech);
	
	@Query("{rollNo: '?0', tech: '?1'}")
	Person findby(String rollno, String tech);
	
	
	public long count();
}
