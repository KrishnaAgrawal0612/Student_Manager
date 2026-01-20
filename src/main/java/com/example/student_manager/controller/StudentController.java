package com.example.student_manager.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class StudentController {
    @GetMapping("/")
    public String student() {
        return "Homepage for student";
    }
}
