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
@RequestMapping("/user/about")
public class AboutController {
    @Autowired
    TeachersService teachersService;

    //인사말
    @GetMapping("/attribute")
    public String about(Model model){

        return "user/about/attribute";
    }


    //경영이념
    @GetMapping("/ideology")
    public String ideology(Model model){

        return "user/about/ideology";
    }


    //연혁
    @GetMapping("/history")
    public String history(Model model){

        return "user/about/history";
    }


    //교직원소개
    @GetMapping("/teachers")
    public String teachers(Model model) throws Exception {
        List<Teachers> teachers =  teachersService.get();
        model.addAttribute("teachers", teachers);
        return "user/about/teachers";
    }


    //지도
    @GetMapping("/directions")
    public String directions(){
        System.out.println("카카오api테스트");
        return "user/about/directions";
    }


}
