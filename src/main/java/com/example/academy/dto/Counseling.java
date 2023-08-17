package com.example.academy.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Counseling {
    private int counselingId;
    private int userCode;
    private String questionText;
    private String answerText;
    private Date submissionDate;
    private Date answerDate;
}
