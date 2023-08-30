package com.example.academy.user;

import com.example.academy.dto.Banner;
import com.example.academy.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    BannerService bannerService;
    @GetMapping(value = {"/", "/index"})
    public String index(Model model) throws Exception {
        List<Banner> banners = bannerService.get();
        model.addAttribute("banners", banners);
        return "user/index";
    }


}