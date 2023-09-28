package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private int userCode;
    private String userId;
    private String userName;
    private String password;
    private String phoneNumber;
    private String address;
    private String postCode;
    private String detailAddress;
    private String email;
}
