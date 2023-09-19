package com.example.academy.controller;


import com.example.academy.dto.User;
import com.example.academy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
    @Autowired
    UserService userService;

    @RequestMapping("/checkId")
    public boolean checkId(@RequestParam("username") String id) throws Exception{
        return userService.checkOverlapId(id) != 0;
    }

    @RequestMapping("/checkPassword")
    public boolean checkPassword(@RequestBody User user) throws Exception{
        return userService.checkPassword(user) != 0;
    }

    @RequestMapping("/updatePassword")
    public boolean updatePassword(@RequestBody User user){
        try {
            userService.changePassword(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
