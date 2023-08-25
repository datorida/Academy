package com.example.academy.service;

import com.example.academy.dto.Branch;
import com.example.academy.dto.User;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService implements MyService<Integer, Branch> {

    @Override
    public void register(Branch branch) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Branch branch) throws Exception {

    }

    @Override
    public Branch get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Branch> get() throws Exception {
        return null;
    }

}