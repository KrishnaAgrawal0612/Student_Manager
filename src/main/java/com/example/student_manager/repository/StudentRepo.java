package com.example.student_manager.repository;

import com.example.student_manager.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<StudentModel,String> {

}
