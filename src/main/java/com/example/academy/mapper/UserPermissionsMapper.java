package com.example.academy.mapper;

import com.example.academy.dto.UserPermissions;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserPermissionsMapper extends MyMapper<Integer, UserPermissions> {
    void insert(UserPermissions userPermissions) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(UserPermissions userPermissions) throws Exception;
    UserPermissions select(Integer integer) throws Exception;
    List<UserPermissions> selectAll() throws Exception;

    UserPermissions findByAdminId(String adminId);

    UserPermissions save(UserPermissions userPermissions);
}
