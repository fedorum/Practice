package com.example.validate_form;

// importing annotations for the controller to display the form, validate it, and redirect the page
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// this controls the 'views' of a webpage and returns different html pages
@Controller
public class WebController implements WebMvcConfigurer {

    // this annotation tags the function to override the method of the WebMvcConfigurer implementation
    @Override
    // the function adds a "/results" view to the program, accessible at "https://{example_link}/results"
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    // this annotation tags the function to handle GET requests
    @GetMapping("/")
    // the function returns the html page named "form.html" 
    public String showForm(UserForm userForm) {
        return "form";
    }

    // this annotation tags the function to handle POST requests
    @PostMapping("/")
    public String checkUserInfo(@Valid UserForm userForm, BindingResult bindingResult) {
        
        // the function checks and returns the form page if the submitted form has errors
        if (bindingResult.hasErrors()) {
            return "form";
        }
        
        // otherwise, the successful results page will be returned
        return "redirect:/results";
    }
}
