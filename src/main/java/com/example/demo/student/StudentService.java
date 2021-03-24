package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Thor",
                        "Thor.Odinson@hotmail.com",
                        LocalDate.of(964, Month.JUNE, 2),
                        1057
                )
        );
    }
}
