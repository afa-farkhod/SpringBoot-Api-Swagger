package com.example.swaggerdemoapi3.service.implementation;

import com.example.swaggerdemoapi3.model.Student;
import com.example.swaggerdemoapi3.repository.StudentRepository;
import com.example.swaggerdemoapi3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> allStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
}
