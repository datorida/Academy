package com.example.academy.user;

import com.example.academy.service.CategoryService;
import com.example.academy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/course")
public class CourseController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    CourseService courseService;

    @RequestMapping("/menu/{categoryId}")
    public String accounting(Model model, @PathVariable int categoryId) throws Exception {
        model.addAttribute("categoryList", categoryService.get());
        model.addAttribute("ctObject", categoryService.get(categoryId));
        model.addAttribute("courseList", courseService.categoryIdByCourseList(categoryId));
        return "user/course/index";
    }

}