package com.example.academy.mapper;

import com.example.academy.dto.Counseling;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CounselingMapper extends MyMapper<Integer, Counseling> {
    void insert(Counseling counseling) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Counseling counseling) throws Exception;
    Counseling select(Integer integer) throws Exception;
    List<Counseling> selectAll() throws Exception;
}
