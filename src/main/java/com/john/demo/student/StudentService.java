package com.john.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Joao",
                        "joaomenezo@gmail.com",
                        LocalDate.of(2004, Month.DECEMBER, 26),
                        20
                )
        );
    }
}
