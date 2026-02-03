package com.example.student_manager.service;

import com.example.student_manager.DTO.StudentRequestDTO;
import com.example.student_manager.DTO.StudentResponseDTO;
import com.example.student_manager.model.StudentModel;
import com.example.student_manager.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo repository;

    public StudentService(StudentRepo repository) {
        this.repository = repository;
    }


    //    public StudentModel addStudent(StudentModel student){
//        return repository.save(student);
//    }
    public StudentResponseDTO addStudent(StudentRequestDTO dto){
        StudentModel student  = new StudentModel();
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        student.setEmail(dto.getEmail());
        StudentModel saved = repository.save(student);

        return new StudentResponseDTO(
                saved.getId(),
                saved.getName(),
                saved.getAge(),
                saved.getEmail()
        );
    }

//    public List<StudentModel> getStudents(){
//        return repository.findAll();
//    }
    public List<StudentResponseDTO> getAllStudents(){
        return repository.findAll()
                .stream()
                .map(s-> new StudentResponseDTO(
                        s.getId(),
                        s.getName(),
                        s.getAge(),
                        s.getEmail()
                )).toList();
    }
    // update
    public StudentModel updateStudent(String id,StudentModel student){
        StudentModel existingStudent = repository.findById(id)
                .orElseThrow(()->new RuntimeException("No student found"));

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());

        return repository.save(existingStudent);
    }

    public void deleteStudent(String id){
        repository.deleteById(id);
    }
}
