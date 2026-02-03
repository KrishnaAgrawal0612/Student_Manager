package com.example.student_manager.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
@Getter
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
    private Map<String,String> errors;
}
