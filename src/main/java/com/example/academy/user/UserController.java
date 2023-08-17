package com.example.academy.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("")
    public String main (){
        return "index";
    }
    @RequestMapping("user")
    public String user(){
        return "user/index";
    }
}
