package com.example.academy.service;

import com.example.academy.dto.Map;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

@Service
public class MapService implements MyService<Integer, Map> {

    @Override
    public void register(Map map) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Map map) throws Exception {

    }

    @Override
    public Map get(Integer integer) throws Exception {
        return null;
    }
}
