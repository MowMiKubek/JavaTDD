package com.tdd.register.repository;

import com.tdd.register.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Long > {
    Student findStudentByFirstName();
}
