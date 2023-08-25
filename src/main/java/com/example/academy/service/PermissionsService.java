package com.example.academy.service;

import com.example.academy.dto.Permissions;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Permissions> get() throws Exception {
        return null;
    }


}
