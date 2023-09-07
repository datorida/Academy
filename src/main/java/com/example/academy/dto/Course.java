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
    private int subCategoryId;
    private String courseName;
    private String description; //과정설명
    private String duration; //과정기간
    private Date startDate;
    private Date endDate;
    private String mainImg;
    private String detailImg;
    private String courseStatus; //모집중, 진행중, 끝남 구분

    private String categoryName;
    private String subCategoryName;


    public int getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getSubCategoryId(){
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public void setSubCategoryName(String subCategoryName){
        this.subCategoryName=subCategoryName;
    }
}

