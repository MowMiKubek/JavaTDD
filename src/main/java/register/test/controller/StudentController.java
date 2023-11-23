package register.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import register.test.model.Student;
import register.test.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.save(student);
    }
}
