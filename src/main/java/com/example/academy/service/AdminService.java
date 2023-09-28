package com.example.academy.service;


import com.example.academy.dto.UserPermissions;
import com.example.academy.mapper.UserPermissionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final UserPermissionsMapper userPermissionsMapper;
    private final PasswordEncoder passwordEncoder;

    @Autowired
     public AdminService(UserPermissionsMapper userPermissionsMapper,PasswordEncoder passwordEncoder){
         this.userPermissionsMapper = userPermissionsMapper;
        this.passwordEncoder = passwordEncoder;
    }
    public boolean authenticate(String adminId, String adminPassword) {
        try {
            UserPermissions admin = userPermissionsMapper.findByAdminId(adminId);
            System.out.println(admin);

            if (admin != null) {
                System.out.println("DB에서 가져온 암호화된 비밀번호: " + admin.getAdminPassword());
                System.out.println("입력한 비밀번호: " + adminPassword);
                boolean passwordMatches = passwordEncoder.matches(adminPassword, admin.getAdminPassword());
                System.out.println("비밀번호 일치 여부: " + passwordMatches);
                return passwordMatches;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}