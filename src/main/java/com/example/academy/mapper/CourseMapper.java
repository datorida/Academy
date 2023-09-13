package com.example.academy.mapper;

import com.example.academy.dto.Course;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper extends MyMapper<Integer, Course> {
    void insert(Course course) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Course course) throws Exception;
    Course select(Integer integer) throws Exception;
    List<Course> selectAll() throws Exception;

    String getCategoryNameByCategoryId(int categoryId);

    List<Course> categoryIdByCourseList(int categoryId) throws Exception;

    String getSubCategoryNameBySubCategoryId(int subCategoryId);
}
