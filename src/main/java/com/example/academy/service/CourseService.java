package com.example.academy.service;

import com.example.academy.dto.Course;
import com.example.academy.frame.MyService;
import com.example.academy.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements MyService<Integer, Course> {

    @Autowired
    CourseMapper courseMapper;
    @Override
    public void register(Course course) throws Exception {
        
    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Course course) throws Exception {

    }

    @Override
    public Course get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Course> get() throws Exception {
        return courseMapper.selectAll();
    }

    public String getCategoryNameBycategoryId(int categoryId) {
        return courseMapper.getCategoryNameBycategoryId(categoryId);
    }

    public String getSubCategoryNameBySubCategoryId(int subCategoryId) {
        return courseMapper.getSubCategoryNameBySubCategoryId(subCategoryId);
    }
}