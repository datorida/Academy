package com.example.academy.admin;


import com.example.academy.dto.Course;
import com.example.academy.service.CategoryService;
import com.example.academy.service.CourseService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Controller
public class AdminController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    CourseService courseService;


    @RequestMapping("/admin")
    public String index() throws Exception {

        return "admin/index";
    }

    @RequestMapping("/admin/category/subcategory/item{cateId}")
    public String item(@PathVariable("cateId") int cateId, Model model) throws Exception {
        List<Course> courseList = courseService.categoryIdByCourseList(cateId);
        model.addAttribute("courseList", courseList);
        model.addAttribute("category", courseService.getCategoryNameByCategoryId(cateId));
        model.addAttribute("cateId", cateId);
        return "admin/category/item";
    }

    @RequestMapping("/admin/course/edit/{courseId}")
    public String courseEdit(@PathVariable("courseId") int courseId, Model model) throws Exception {
        model.addAttribute("course", courseService.get(courseId));

        return "admin/category/form";
    }

    @RequestMapping("admin/course/save")
    public String courseSave(@ModelAttribute Course course, @RequestParam("mainImg") MultipartFile mainImg, Model model) throws Exception {
        System.out.println(course);
        model.addAttribute("course", course);
        return "admin/category/add";
    }

    @RequestMapping("admin/course/editSave")
    public String courseEditSave(@ModelAttribute Course course, Model model) throws Exception {
        // 파일 로직 구현 예정
        if(!course.getFiles().isEmpty()){
            System.out.println("없음");
        }
        courseService.modify(course);
        return "admin/category/add";
    }
    @RequestMapping("/admin/addSubcategory/Item{cateId}")
    public String addSubcategory(@PathVariable int cateId, Model model) throws Exception{
        model.addAttribute("category", categoryService.get(cateId));
        return "admin/category/add";
    }



}

