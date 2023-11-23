package com.tdd.register;

import com.google.gson.Gson;
import com.tdd.register.model.Student;
import com.tdd.register.repository.StudentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureMockMvc
@EnableAutoConfiguration(exclude=SecurityAutoConfiguration.class)*/
public class RegisterIntegrationTest {
  /*  @Autowired
    private MockMvc mockMvc;

    @Autowired
    private StudentRepository repository;

    @BeforeEach
    public void init() {
        createTestStudent("Paul", "Simon", "VIIIA");
        createTestStudent("Axel", "Manhattan", "VIIIB");
    }

    @Test
    public void givenStudents_whenGetStudents_thenStatus200() throws Exception {
        mockMvc.perform(get("/api/students")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(greaterThanOrEqualTo(2))))
                .andExpect(jsonPath("$[0].firstname", is("Paul")))
                .andExpect(jsonPath("$[0].firstname", is("Axel")))
                .andExpect(jsonPath("$[0].lastname", is("Simon")))
                .andExpect(jsonPath("$[0].lastname", is("Manhattan")))
                .andExpect(jsonPath("$[0].className", is("VIIIA")))
                .andExpect(jsonPath("$[0].className", is("VIIIB")));
    }

    @Test
    public void givenStudent_whenCreateStudents_thenStatus201() throws Exception {
        Student student = createTestStudent("Max","Planck", "VI");
        Gson gson = new Gson();
        String studentJson = gson.toJson(student);
        mockMvc.perform(post("/api/students")
                .contentType(MediaType.APPLICATION_JSON)
                .content(studentJson))
                .andExpect(jsonPath("$.firstname", is("Max")))
                .andExpect(jsonPath("$.lastname", is("Planck")))
                .andExpect(jsonPath("$.className", is("VI")));
    }

    private Student createTestStudent(String name, String surname, String className) {
        Student student = new Student(null,name,surname, className);
        return repository.saveAndFlush(student);
    }*/
}
