package com.example.academy.mapper;

import com.example.academy.dto.Image;
import com.example.academy.dto.Permissions;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ImageMapper extends MyMapper<Integer, Image> {
    void insert(Image image) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Image image) throws Exception;
    Image select(Integer integer) throws Exception;

    List<Image> selectAll() throws Exception;

}
