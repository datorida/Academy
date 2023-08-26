package com.example.academy.service;

import com.example.academy.dto.Teachers;
import com.example.academy.frame.MyService;
import com.example.academy.mapper.TeachersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService implements MyService<Integer, Teachers> {

    @Autowired
    TeachersMapper teachersMapper;
    @Override
    public void register(Teachers teachers) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Teachers teachers) throws Exception {

    }

    @Override
    public Teachers get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Teachers> get() throws Exception {
        return teachersMapper.selectAll();
    }


}
