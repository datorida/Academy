package com.example.academy.service;

import com.example.academy.dto.UserPermissions;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPermissionsService implements MyService<Integer, UserPermissions> {

    @Override
    public void register(UserPermissions userPermissions) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(UserPermissions userPermissions) throws Exception {

    }

    @Override
    public UserPermissions get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<UserPermissions> get() throws Exception {
        return null;
    }


}
