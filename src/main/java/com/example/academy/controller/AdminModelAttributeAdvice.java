package com.example.academy.controller;


import com.example.academy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(basePackages = "com.example.academy.admin")
public class AdminModelAttributeAdvice {

    @Autowired
    CategoryService categoryService;
    @ModelAttribute
    public void addAdminAttribute(Model model) throws Exception {
        model.addAttribute("categoryList", categoryService.get());
    }
}
