package com.example.academy.user;

import com.example.academy.dto.User;
import com.example.academy.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    HttpSession session;

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/join")
    public String join(){

        return "user/join";
    }

    @RequestMapping("/loginOk")
    public String loginOk(@ModelAttribute User user, Model model) throws Exception {
        String returnUrl = "user/login";
        String msg = "";
        if(userService.loginUser(user) != null){
            session.setAttribute("loginUser", userService.loginUser(user));
            returnUrl = "/";
            msg = "로그인에 성공하였습니다."+ user.getUserId() +"환영합니다.";
        }else {
            msg = "로그인에 실패했습니다. 다시 시도해주세요.";
        }
        model.addAttribute("msg", msg);
        return returnUrl;
    }

    @RequestMapping("/register")
    public String register(@ModelAttribute User user) throws Exception {

        userService.register(user);
        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(){
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

}
