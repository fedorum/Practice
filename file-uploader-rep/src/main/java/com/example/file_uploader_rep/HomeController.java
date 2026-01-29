package com.example.file_uploader_rep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    
    // displays the "home.html" page when the "[host]/home" URL is accessed
    @GetMapping("/home")
    public String home(@RequestParam(required = false) String adid, Model model) {
        // if the user has a valid adid, the model for the home page contains it to be displayed on the page
        if (adid != null) {
            model.addAttribute("adid", adid);
        }
        return "home";
    }
}
