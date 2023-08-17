package com.example.academy.service;

import com.example.academy.dto.Permissions;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

@Service
public class PermissionsService implements MyService<Integer, Permissions> {

    @Override
    public void register(Permissions permissions) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Permissions permissions) throws Exception {

    }

    @Override
    public Permissions get(Integer integer) throws Exception {
        return null;
    }
}
