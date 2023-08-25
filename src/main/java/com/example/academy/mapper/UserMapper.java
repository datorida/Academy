package com.example.academy.mapper;

import com.example.academy.dto.Course;
import com.example.academy.dto.User;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper extends MyMapper<Integer, User> {
    void insert(User user) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(User user) throws Exception;
    User select(Integer integer) throws Exception;
    List<User> selectAll() throws Exception;

    Integer checkOverlapId(String id) throws Exception;

    User loginCheck(User user) throws Exception;
}
