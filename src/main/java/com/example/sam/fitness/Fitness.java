package com.example.sam.fitness;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
// to run the application on terminal $ .mvnw spring-boot:run
@SpringBootApplication
@RestController // make the class to serve rest endpoints
public class Fitness {
	public static void main(String[] args) {

		SpringApplication.run(Fitness.class, args);
    }

}
