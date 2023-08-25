package com.example.academy.service;

import com.example.academy.dto.AcademyMap;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademyMapService implements MyService<Integer, AcademyMap> {

    @Override
    public void register(AcademyMap academyMapmap) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(AcademyMap academyMapmap) throws Exception {

    }

    @Override
    public AcademyMap get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<AcademyMap> get() throws Exception {
        return null;
    }

}
