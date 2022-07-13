package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student rocky =
          new Student("Rocky", "rocky.kgf@gmail.com", LocalDate.of(1990, Month.JANUARY, 21));

      Student vikram =
          new Student("Vikram", "vikram@gmail.com", LocalDate.of(1985, Month.AUGUST, 16));

      repository.saveAll(List.of(rocky, vikram));
    };
  }
  ;
}
