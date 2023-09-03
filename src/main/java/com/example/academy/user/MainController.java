package com.example.academy.user;

import com.example.academy.dto.Banner;
import com.example.academy.dto.Course;
import com.example.academy.service.BannerService;
import com.example.academy.service.CourseService;
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

    @Autowired
    CourseService courseService;
    @GetMapping(value = {"/", "/index"})
    public String index(Model model) throws Exception {
        List<Banner> banners = bannerService.get();
        List<Course> courses= courseService.get();
        for(Course course : courses){
            int categoryId=course.getCategoryId();
         String categoryName= courseService.getCategoryNameBycategoryId(categoryId);
         System.out.print(categoryName);
         course.setCategoryName(categoryName);
        }
        model.addAttribute("courses", courses);
        model.addAttribute("banners", banners);

        return "user/index";
    }

}
