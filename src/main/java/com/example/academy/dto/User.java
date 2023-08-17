package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int userId;
    private String password;
    private String phoneNumber;
    private String address;
    private String email;
}
