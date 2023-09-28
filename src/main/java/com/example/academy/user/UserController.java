package com.example.academy.user;

import com.example.academy.dto.User;
import com.example.academy.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    HttpSession session;

    @Autowired
    UserService userService;

    @Autowired
    private PasswordEncoder pwEncoder;
    @RequestMapping("/login")
    public String login() {
        return "user/login";
    }

    //회원가입 서비스
    @PostMapping("/register")
    public String joinService(User user) throws Exception {
        String rawPw="";
        String encodePw="";

        rawPw=user.getPassword();
        encodePw=pwEncoder.encode(rawPw);
        user.setPassword(encodePw);

        userService.register(user);
        return "user/login";

    }
    //회원가입 창
    @RequestMapping("/join")
    public String join(Model model){
        model.addAttribute("permissions", "10");
        return "user/join";
    }

    @RequestMapping("/loginOk")
    public String loginOk(@ModelAttribute User user, Model model) throws Exception {
        String returnUrl = "user/login";
        String msg = "";
        if (userService.loginUser(user) != null) {
            session.setAttribute("loginUser", userService.loginUser(user));
            returnUrl = "redirect:/";
            msg = "로그인에 성공하였습니다." + user.getUserId() + "환영합니다.";
        } else {
            msg = "로그인에 실패했습니다. 다시 시도해주세요.";
        }
        model.addAttribute("msg", msg);
        return returnUrl;
    }

    @RequestMapping("/logout")
    public String logout() {
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

    @RequestMapping("/mypage")
    public String mypage(Model model) {
        model.addAttribute("user", session.getAttribute("loginUser"));
        return "user/mypage/index";
    }

    @RequestMapping("/updateInfo")
    public String updateInfo(@ModelAttribute User user, Model model) throws Exception {
        userService.modifyInfo(user);
        userService.loginUser(user);
        String msg = "업데이트가 진행되어 로그아웃이 진행되었습니다. 다시 로그인을 진행해주세요.";
        model.addAttribute("msg", msg);
        return "redirect:/login";
    }

}
