package com.example.academy.mapper;

import com.example.academy.dto.AcademyMap;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AcademyMapMapper extends MyMapper<Integer, AcademyMap> {
    void insert(AcademyMap academyMap) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(AcademyMap academyMap) throws Exception;
    AcademyMap select(Integer integer) throws Exception;
    List<AcademyMap> selectAll() throws Exception;
}
