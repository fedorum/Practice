package com.example.accessing_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// importing a logger to print the database query results to the console
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// importing a command line runner to seed and query the database when the application starts
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataApplication.class, args);
	}

	// initialising the logger to print out statements to the console
	private static final Logger logger = LoggerFactory.getLogger(AccessingDataApplication.class);

	// this bean indicates that the command line runner should be created automatically by the Spring framework at runtime
	@Bean
	// the command line runner component runs immediately after the application and Spring context have loaded
	public CommandLineRunner demo(DoctorRepository repository) {
		return (args) -> {
			// seeding the database with sample doctors (i.e. clinicians)
			repository.save(new Doctor("Andrew", "Makmur"));
			repository.save(new Doctor("Clara", "Ngoh"));
			repository.save(new Doctor("James", "Lim"));
			repository.save(new Doctor("Ke Yuan", "Ngiam"));

			// logging/ printing the doctors found by the native findAll function
			logger.info("\n\nDoctors found with findAll():\n");
			repository.findAll().forEach(Doctor -> {
				logger.info(Doctor.toString());
			});
			logger.info("\n");
			
			// logging the doctor found by the native findId function
			logger.info("Doctor found with the ID, '1L':\n");
			Doctor doctor = repository.findById(1L);
			logger.info(doctor.toString());
			logger.info("\n");

			// logging the doctors found by the custom findByLastName function
			logger.info("Doctors found with the last name, 'Lim':\n");
			repository.findByLastName("Lim").forEach(Doctor -> {
				logger.info(Doctor.toString());
			});
			logger.info("\n");
		};
	}

}
