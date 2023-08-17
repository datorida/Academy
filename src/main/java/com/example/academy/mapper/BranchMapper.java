package com.example.academy.mapper;

import com.example.academy.dto.Branch;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BranchMapper extends MyMapper<Integer, Branch> {
    void insert(Branch branch) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Branch branch) throws Exception;
    Branch select(Integer integer) throws Exception;
    List<Branch> selectAll() throws Exception;
}
