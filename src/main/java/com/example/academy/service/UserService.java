package com.example.academy.service;

import com.example.academy.dto.User;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements MyService<Integer, User> {

    @Override
    public void register(User user) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(User user) throws Exception {

    }

    @Override
    public User get(Integer integer) throws Exception {
        return null;
    }
}
