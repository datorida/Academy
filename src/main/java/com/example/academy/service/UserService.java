package com.example.academy.service;

import com.example.academy.dto.User;
import com.example.academy.frame.MyService;
import com.example.academy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements MyService<Integer, User> {
    @Autowired
    UserMapper userMapper;

    @Override
    public void register(User user) throws Exception {
        userMapper.insert(user);
    }

    @Override
    public void remove(Integer id) throws Exception {

    }

    @Override
    public void modify(User user) throws Exception {

    }

    @Override
    public User get(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<User> get() throws Exception {
        return null;
    }

    public User loginUser(User user) throws Exception{
        return userMapper.loginCheck(user);
    }


    public Integer checkOverlapId(String id) throws Exception {
        return userMapper.checkOverlapId(id);
    }
}
