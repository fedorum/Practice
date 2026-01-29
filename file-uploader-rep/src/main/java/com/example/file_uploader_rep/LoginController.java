package com.example.file_uploader_rep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {
    
    // displays the "login.html" page when the "[host]/login" URL is accessed
    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    // redirects the user to the "[host]/home?adid=" URL after they have logged in
    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Login login) {
        // appends the user's adid to the URL as a query parameter
        return "redirect:/home?adid=" + login.getAdid();
    }

}
