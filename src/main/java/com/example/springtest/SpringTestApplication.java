package com.example.springtest;

import com.example.springtest.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }

//    @GetMapping
//    public List<Student> hello(){
//        return List.of(new Student(1L, "Marry", "marry@gmail.com",
//                LocalDate.of(2000,10,5), 22));
//    }
}
