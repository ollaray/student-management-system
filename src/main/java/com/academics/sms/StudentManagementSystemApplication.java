package com.academics.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.academics.sms.entity.Student;
import com.academics.sms.repo.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("James","Thommy","jam@yahoo.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("William","Shakespear","willyShakes@yahoo.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Shade","Olushina","shad@gmail.com");
//		studentRepository.save(student3);
		
	}

}
