package com.example.academy.mapper;

import com.example.academy.dto.Map;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MapMapper extends MyMapper<Integer, Map> {
    void insert(Map map) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Map map) throws Exception;
    Map select(Integer integer) throws Exception;
    List<Map> selectAll() throws Exception;
}
