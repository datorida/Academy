package com.example.academy.user;

import com.example.academy.dto.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    HttpSession session;

    @RequestMapping(value = {"/", "/index"})
    public String index (Model model){

        return "user/index";
    }


    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/logout")
    public String logout(){
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

}
