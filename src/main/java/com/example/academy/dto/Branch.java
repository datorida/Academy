package com.example.academy.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Branch {
    private int branchId;
    private String branchName;
    private int location;
}
