package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserPermissions {
    private int id;
    private int userCode;
    private String adminId; // 관리자 아이디
    private String adminPassword; // 암호화된 관리자 비밀번호
    private String role;
}
