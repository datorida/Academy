package com.example.academy.service;

import com.example.academy.dto.Board;
import com.example.academy.dto.Image;
import com.example.academy.frame.MyService;
import com.example.academy.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService implements MyService<Integer, Image> {

    @Autowired
    ImageMapper imageMapper;
    @Override
    public void register(Image image) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Image image) throws Exception {

    }

    @Override
    public Image get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Image> get() throws Exception {
        return imageMapper.selectAll();
    }


}
