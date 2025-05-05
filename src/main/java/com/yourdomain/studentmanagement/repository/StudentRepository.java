package com.yourdomain.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yourdomain.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom query methods here if needed
} 