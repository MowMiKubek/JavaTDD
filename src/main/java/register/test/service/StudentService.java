package register.test.service;

import org.springframework.http.ResponseEntity;
import register.test.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
    public ResponseEntity<Student> getStudentById(long id);
    public Student save(Student student);
}
