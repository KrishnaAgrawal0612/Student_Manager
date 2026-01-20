package com.example.student_manager.service;

import com.example.student_manager.model.StudentModel;
import com.example.student_manager.repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepo repository;

    public StudentService(StudentRepo repository){
        this.repository=repository;
    }
    //Create

    public StudentModel addStudent(StudentModel student){
        return repository.save(student);
    }

}
