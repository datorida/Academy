package com.example.academy.service;

import com.example.academy.dto.Tuition;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuitionService implements MyService<Integer, Tuition> {

    @Override
    public void register(Tuition tuition) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Tuition tuition) throws Exception {

    }

    @Override
    public Tuition get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Tuition> get() throws Exception {
        return null;
    }


}
