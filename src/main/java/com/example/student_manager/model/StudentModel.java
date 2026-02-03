package com.example.student_manager.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="students")

public class StudentModel {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
