package com.example.file_uploader_rep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String home(@RequestParam(required = false) String adid, Model model) {
        if (adid != null) {
            model.addAttribute("adid", adid);
        }
        return "home";
    }
}
