package com.example.academy.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/course")
public class CourseController {


    @GetMapping("/accounting")
    public String accounting(Model model) {

        return "user/course/accounting";
    }


    @GetMapping("/mechanical-design")
    public String mechanicalDesign(Model model) {

        return "user/course/mechanical-design";
    }


    @GetMapping("/computer")
    public String computer(Model model) {

        return "user/course/computer";
    }


    @GetMapping("/digital-design")
    public String digitalDesign(Model model) {

        return "user/course/digital-design";
    }


    @GetMapping("/safety-engineer")
    public String safetyEngineer(Model model) {

        return "user/course/safety-engineer";
    }

}