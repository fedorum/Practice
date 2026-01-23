package com.example.file_uploader_rep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login() {
        // returns the html page within the templates folder titled "login"
        return "login";
    }
}
