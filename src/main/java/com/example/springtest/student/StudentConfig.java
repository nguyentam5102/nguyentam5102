package com.example.springtest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//
//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            Student marry =  new Student(
//                "Marry",
//                "marry@gmail.com",
//                LocalDate.of(2000, Month.DECEMBER,5)
//        );
//            Student jake =  new Student(
//                    "Jake",
//                    "jake@gmail.com",
//                    LocalDate.of(2000, Month.JANUARY,10)
//            );
//
//            studentRepository.saveAll(
//                    List.of(marry, jake)
//            );
//        };
//    }
//}
