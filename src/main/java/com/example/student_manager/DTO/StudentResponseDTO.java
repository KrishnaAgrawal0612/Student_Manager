package com.example.student_manager.DTO;

import lombok.Getter;

@Getter
public class StudentResponseDTO {
    String id;
    String name;
    int age;
    String email;

    public StudentResponseDTO(String id, String name, int age, String email) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.email=email;
    }
}
