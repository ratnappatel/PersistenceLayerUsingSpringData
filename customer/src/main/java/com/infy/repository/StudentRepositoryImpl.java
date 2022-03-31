package com.infy.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.infy.entity.Student;

@Repository
public class StudentRepositoryImpl {
	
	// JPA entity manager = connection+preparedstatement
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public String insertData(Student student)
	{
		/*
		 * Student student=new Student(); student.setRollno(101);
		 * student.setName("ratna"); student.setStream("IT");
		 */
		
		entityManager.persist(student);
		return "Record inserted successfully";
	}

}
