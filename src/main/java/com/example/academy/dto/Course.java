package com.example.academy.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    private int courseId;
    private int categoryId;
    private String courseName;
    private String description;
    private String duration;
    private Date startDate;
    private Date endDate;
}
