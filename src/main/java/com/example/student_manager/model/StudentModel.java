package com.example.student_manager.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@RestController
@NoArgsConstructor
@Document(collection="students")

public class StudentModel {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
