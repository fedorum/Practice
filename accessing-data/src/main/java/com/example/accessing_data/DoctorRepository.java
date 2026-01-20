package com.example.accessing_data;

import java.util.List;

// importing the spring boot crud repository for its in-built methods for data access
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    
    // finds a list of doctors based on their last name
    List<Doctor> findByLastName(String lastName);

    // finds the doctor based on their id
    Doctor findById(long id);
}
