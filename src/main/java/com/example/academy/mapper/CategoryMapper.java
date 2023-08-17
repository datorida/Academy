package com.example.academy.mapper;

import com.example.academy.dto.Category;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper extends MyMapper<Integer, Category> {
    void insert(Category category) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Category category) throws Exception;
    Category select(Integer integer) throws Exception;
    List<Category> selectAll() throws Exception;
}
