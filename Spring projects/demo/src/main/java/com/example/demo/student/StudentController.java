package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController {

    @GetMapping
    public List<Serializable> getStudents() {
        return List.of(1L, "Ntando", "ntando.jacob@gmail.com", LocalDate.of(2003, 04, 21), 22);
    }
}
