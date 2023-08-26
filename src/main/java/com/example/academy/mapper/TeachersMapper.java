package com.example.academy.mapper;

import com.example.academy.dto.Permissions;
import com.example.academy.dto.Teachers;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeachersMapper extends MyMapper<Integer, Teachers> {
    void insert(Teachers teachers) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Teachers teachers) throws Exception;
    Teachers select(Integer integer) throws Exception;
    List<Teachers> selectAll() throws Exception;

}
