package com.example.swaggerdemoapi3.service;

import com.example.swaggerdemoapi3.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> allStudents();
    Student addStudent(Student student);
}
