package com.example.rest_service;

// imports the annotations required to run the application
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this annotation is a convenience one that adds the following annotations
// Configuration: tags the class as the source of bean definitions
// EnableAutoConfiguration: tells Spring Boot to look for bean definitions in other class files
// ComponentScan: tells Spring Boot to look for components like controllers in the package/ other class files
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
