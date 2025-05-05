package com.yourdomain.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yourdomain.studentmanagement.entity.Student;
import com.yourdomain.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// Optional: Add some initial student data
		/*
		Student student1 = new Student("John", "Doe", "john.doe@example.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Jane", "Smith", "jane.smith@example.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Mike", "Johnson", "mike.johnson@example.com");
		studentRepository.save(student3);
		*/
	}
} 