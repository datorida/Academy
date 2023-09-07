package com.example.academy.user;

import com.example.academy.dto.Teachers;
import com.example.academy.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/counselling")
public class CounsellingController {

    @GetMapping("/online")
    public String online(Model model){

        return "user/counselling/online";
    }

    @GetMapping("/inquiry")
    public String inquiry(Model model){

        return "user/counselling/inquiry";
    }

    @GetMapping("/complaint")
    public String complaint(Model model){

        return "user/counselling/complaint";
    }

    @GetMapping("/application")
    public String application(Model model) {

        return "user/counselling/application";
    }

}
