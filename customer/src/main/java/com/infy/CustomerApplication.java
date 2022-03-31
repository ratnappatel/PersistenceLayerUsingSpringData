package com.infy;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.entity.Student;
import com.infy.repository.StudentRepositoryImpl;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {

	@Autowired 
	StudentRepositoryImpl studentRepository;	
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno ");
		int rollno=sc.nextInt();
		System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter stream ");
		String stream=sc.next();
		Student student=new Student();
		student.setRollno(rollno);
		student.setName(name);
		student.setStream(stream);
		
		String result=studentRepository.insertData(student);
		System.out.println(result);
	
		
	}
	
	

}
