package com.example.academy.service;

import com.example.academy.dto.Banner;
import com.example.academy.dto.Banner;
import com.example.academy.frame.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService implements MyService<Integer, Banner> {

    @Override
    public void register(Banner banner) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Banner banner) throws Exception {

    }

    @Override
    public Banner get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Banner> get() throws Exception {
        return null;
    }


}
