package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teachers {
    private int teachersId;
    private String teacherImg;
    private String teachersName;
    private String position;
    private String introduce;
}
