package com.example.student_manager.controller;


import com.example.student_manager.DTO.StudentRequestDTO;
import com.example.student_manager.DTO.StudentResponseDTO;
import com.example.student_manager.model.StudentModel;
import com.example.student_manager.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/")
    public String home(){
        return "welcome to home page....";
    }
    private final StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping("/addStudent")
    public StudentResponseDTO addStudent(@Valid @RequestBody StudentRequestDTO student){
        return service.addStudent(student);
    }


    @GetMapping("/students")
    public List<StudentResponseDTO> getAllStudents(){
        return service.getAllStudents();
    }
    @PutMapping("/update/{id}")

    public StudentResponseDTO updateStudent(@PathVariable String id,@RequestBody StudentResponseDTO student){
        return service.updateStudent(id,student);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

//    @PutMapping("/update/{id}")
//    public StudentModel updateStudent(@PathVariable String id, @RequestBody StudentModel student){
//        return service.updateStudent(id,student);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable String id){
//        service.deleteStudent(id);
//
//    }

}
