package com.example.academy.mapper;

import com.example.academy.dto.AcademyMap;
import com.example.academy.dto.Banner;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BannerMapper extends MyMapper<Integer, Banner> {
    void insert(Banner banner) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Banner banner) throws Exception;
    Banner select(Integer integer) throws Exception;

    List<Banner> selectAll() throws Exception;
}
