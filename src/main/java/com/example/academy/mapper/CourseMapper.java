package com.example.academy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class CourseMapper extends MyMapper<Integer, User>{
}
