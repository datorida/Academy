package com.example.academy.controller;


import com.example.academy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
    @Autowired
    UserService userService;

    @RequestMapping("/checkId")
    public Boolean checkId(@RequestParam("username") String id) throws Exception{
        Boolean isOverlap = true;
        if(userService.checkOverlapId(id) == 0){
            isOverlap = false;
        }
        return isOverlap;
    }

}
