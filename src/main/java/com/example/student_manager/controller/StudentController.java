package com.example.student_manager.controller;

import com.example.student_manager.model.StudentModel;
import com.example.student_manager.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/students")
    public List<StudentModel> getAllStudents(){
       return  service.getAllStudents();
    }
    @PutMapping("/update/{id}")
    public StudentModel updateStudent(@PathVariable String id,@RequestBody StudentModel student){
       return service.updateStudent(id,student);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }
}
