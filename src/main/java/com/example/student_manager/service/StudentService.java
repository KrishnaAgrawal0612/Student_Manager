package com.example.student_manager.service;

import com.example.student_manager.model.StudentModel;
import com.example.student_manager.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<StudentModel> getAllStudents(){
        return repository.findAll();
    }
    public StudentModel updateStudent(String id,StudentModel student){
        StudentModel existingStudent =repository.findById(id).
                orElseThrow(()-> new RuntimeException("no student found with this id"));
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        return repository.save(existingStudent);
    }
    public void delete(String idk){
        if(!repository.existsById(idk)){
            throw new RuntimeException("no student found with this id");
        }
        repository.deleteById(idk);
    }


}
