package com.test.test.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student joao = new Student(
                    "joao",
                    "email@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 21)
            );

            Student pedrao = new Student(
                    "pedrao",
                    "pedro@gmail.com",
                    LocalDate.of(2004, Month.DECEMBER, 20)
            );

            studentRepository.saveAll(List.of(joao, pedrao));
        };





    }
}
