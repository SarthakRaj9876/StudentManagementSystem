package com.yourdomain.studentmanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yourdomain.studentmanagement.entity.Student;
import com.yourdomain.studentmanagement.repository.StudentRepository;
import com.yourdomain.studentmanagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> 
                     new IllegalArgumentException("Invalid student Id: " + id));
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
} 