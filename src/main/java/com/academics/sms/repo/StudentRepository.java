package com.academics.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academics.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
