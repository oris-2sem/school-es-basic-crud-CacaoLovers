package ru.itis;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@AllArgsConstructor
public class SchoolBasicCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolBasicCrudApplication.class, args);
    }

}
