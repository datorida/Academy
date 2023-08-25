package com.example.academy.service;

import com.example.academy.dto.Counseling;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounselingService implements MyService<Integer, Counseling> {

    @Override
    public void register(Counseling counseling) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Counseling counseling) throws Exception {

    }

    @Override
    public Counseling get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Counseling> get() throws Exception {
        return null;
    }


}
