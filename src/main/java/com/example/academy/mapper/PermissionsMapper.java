package com.example.academy.mapper;

import com.example.academy.dto.Permissions;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PermissionsMapper extends MyMapper<Integer, Permissions> {
    void insert(Permissions permissions) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Permissions permissions) throws Exception;
    Permissions select(Integer integer) throws Exception;
    List<Permissions> selectAll() throws Exception;
}
