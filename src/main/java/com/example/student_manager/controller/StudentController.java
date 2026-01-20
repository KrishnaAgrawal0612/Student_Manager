package com.example.student_manager.controller;

import com.example.student_manager.model.StudentModel;
import com.example.student_manager.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
public class StudentController {
   private final StudentService service;
   public StudentController(StudentService service){
       this.service=service;
   }
   // create fn API;
    @PostMapping("/add-student")
    public StudentModel addStudent(@RequestBody StudentModel student){
       return service.addStudent(student);
    }
}
