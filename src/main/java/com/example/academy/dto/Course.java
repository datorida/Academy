package com.example.academy.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    private int courseId;


    private String courseName;
    private String description; //과정설명
    private String duration; //과정기간
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String mainImg;
    private String detailImg;
    private String courseStatus; //모집중, 진행중, 끝남 구분

    private int categoryId;
    private String categoryName;

    private int subCategoryId;
    private String subCategoryName;

    private List<MultipartFile> files;

}

