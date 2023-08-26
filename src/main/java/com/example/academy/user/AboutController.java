package com.example.academy.user;

import com.example.academy.dto.Teachers;
import com.example.academy.service.TeachersService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/about")
public class AboutController {
    @Autowired
    TeachersService teachersService;
    @GetMapping("/about")
    public String about(Model model){

        return "user/about/about";
    }

    @GetMapping("/teachers")
    public String teachers(Model model) throws Exception {
        List<Teachers> teachers =  teachersService.get();
        model.addAttribute("teachers", teachers);
        return "user/about/teachers";
    }

    @GetMapping("/directions")
    public String directions(){
        System.out.println("카카오api테스트");
        return "user/about/directions";
    }
}
