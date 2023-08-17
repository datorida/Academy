package com.example.academy.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tuition {
    private int inquiryId;
    private int courseId;
    private BigDecimal tuitionAmount;
    private String studentType;
    private BigDecimal totalAmount;
}
