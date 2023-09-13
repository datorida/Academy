package com.example.academy.service;

import com.example.academy.dto.Category;
import com.example.academy.frame.MyService;
import com.example.academy.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements MyService<Integer, Category> {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void register(Category Category) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Category Category) throws Exception {

    }

    @Override
    public Category get(Integer id) throws Exception {
        return categoryMapper.select(id);
    }

    @Override
    public List<Category> get() throws Exception {
        return categoryMapper.selectAll();
    }

}
