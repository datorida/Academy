package com.example.academy.admin;


import com.example.academy.dto.Course;
import com.example.academy.service.AdminService;
import com.example.academy.service.CategoryService;
import com.example.academy.service.CourseService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Controller
public class AdminController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    CourseService courseService;

    @Autowired
    AdminService adminService;


    @RequestMapping("/admin")
    public String index() throws Exception {

        return "/admin/index";
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


    @GetMapping("/adminLogin")
    public String login (Model model, HttpSession session){
        //로그인된 상태에서 /admin 페이지로 진입하려고 할 경우 인트라넷으로 리다이렉트
        if(session.getAttribute("adminSession") != null){
            return "/admin/index";
        }
        return "/user/adminLogin";
    }


    //관리자 로그인
    @PostMapping("/loginForm")
    public String adminLogin(@RequestParam String adminId, @RequestParam String adminPassword, Model model, HttpSession session){
        boolean authenticated = adminService.authenticate(adminId, adminPassword);
        System.out.println("adminId: " + adminId);
        System.out.println("authenticated: " + authenticated);
        if(authenticated){
            session.setAttribute("adminSession", adminId);
            return "/admin/index";
        }else{
            model.addAttribute("error","관리자가 아닙니다");
            return "/user/adminLogin";
        }
    }

    //로그아웃
    @GetMapping("/admin/logout")
    public String logout(HttpServletRequest request) {
        // 로그아웃 로직을 수행
        request.getSession().invalidate(); // 세션 무효화
        return "user/index"; // 로그아웃 후 리다이렉트할 페이지
    }
}


