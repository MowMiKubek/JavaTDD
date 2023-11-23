package register.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import register.test.model.Student;
import register.test.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceDefault implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public ResponseEntity<Student> getStudentById(long id) {
        Optional<Student> result = studentRepository.findById(id);
        if(result.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(result.get());
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
