package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Banner {
    private int bannerNum;
    private String bannerUrl;
    private int x;
    private int y;
}
