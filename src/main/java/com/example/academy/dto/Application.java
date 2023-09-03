package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Application {
    private int applicationId;
    private String identificationPhoto;
    private String applicantName;
    private String homeNumber;
    private String phoneNumber;
    private String postalCode;
    private String applicantAddress;
}

