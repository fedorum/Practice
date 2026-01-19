package com.example.authenticatingldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// this annotation allows Spring Boot to detect this class as a web page controller
@RestController
public class HomeController {

	@GetMapping("/")
    // the string returned by this function is displayed on the page
	public String index() {
		return "Welcome to the home page!";
	}
}
