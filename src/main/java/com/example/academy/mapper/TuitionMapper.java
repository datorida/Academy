package com.example.academy.mapper;

import com.example.academy.dto.Tuition;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TuitionMapper extends MyMapper<Integer, Tuition> {
    void insert(Tuition tuition) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Tuition tuition) throws Exception;
    Tuition select(Integer integer) throws Exception;
    List<Tuition> selectAll() throws Exception;
}
