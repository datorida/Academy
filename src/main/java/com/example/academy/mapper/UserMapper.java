package com.example.academy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class UserMapper extends MyMapper<Integer, User>{
}
