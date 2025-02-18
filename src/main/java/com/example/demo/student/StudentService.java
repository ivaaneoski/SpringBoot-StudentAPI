package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        23,
                        LocalDate.of(2002,12,5),
                        "jasmine@scissors.com",
                        "Jasmine",
                        6055l
                )
        );
    }
}

