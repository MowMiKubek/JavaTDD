package com.tdd.register.controller;

import com.tdd.register.repository.StudentRepository;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
