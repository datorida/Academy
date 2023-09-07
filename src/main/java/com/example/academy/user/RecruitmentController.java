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
@RequestMapping("/user/recruitment")
public class RecruitmentController {


    @GetMapping("/recruiting")
    public String recruiting(Model model) {

        return "user/recruitment/recruiting";
    }


    @GetMapping("/ongoing")
    public String ongoing(Model model) {

        return "user/recruitment/ongoing";
    }


    @GetMapping("/annual")
    public String annual(Model model) {

        return "user/recruitment/annual";
    }


    @GetMapping("/announcement")
    public String announcement(Model model) {

        return "user/recruitment/announcement";
    }


    @GetMapping("/card-info")
    public String cardInfo(Model model) {

        return "user/recruitment/card-info";
    }


    @GetMapping("/training-info")
    public String trainingInfo(Model model) {

        return "user/recruitment/training-info";
    }
}