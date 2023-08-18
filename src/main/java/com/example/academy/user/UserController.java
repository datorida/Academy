package com.example.academy.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = {"/", "/index"})
    public String index (Model model){
        return "user/index";
    }

}
