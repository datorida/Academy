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
        courseMapper.update(course);
    }

    @Override
    public Course get(Integer id) throws Exception {
        return courseMapper.select(id);
    }

    @Override
    public List<Course> get() throws Exception {
        return courseMapper.selectAll();
    }

    public String getCategoryNameByCategoryId(int categoryId) {
        return courseMapper.getCategoryNameByCategoryId(categoryId);
    }

    public List<Course> categoryIdByCourseList(int categoryId) throws Exception {
        return courseMapper.categoryIdByCourseList(categoryId);
    }

    public String getSubCategoryNameBySubCategoryId(int subCategoryId) {
        return courseMapper.getSubCategoryNameBySubCategoryId(subCategoryId);
    }

}