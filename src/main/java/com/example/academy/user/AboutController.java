package com.example.academy.user;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/about")
public class AboutController {
    @GetMapping("/about")
    public String about(Model model){

        return "user/about/about";
    }

    @GetMapping("/teachers")
    public String teachers(){
        return "user/about/teachers";
    }
}
