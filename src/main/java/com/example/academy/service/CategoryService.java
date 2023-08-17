package com.example.academy.service;

import com.example.academy.dto.Category;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements MyService<Integer, Category> {

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
    public Category get(Integer integer) throws Exception {
        return null;
    }
}
