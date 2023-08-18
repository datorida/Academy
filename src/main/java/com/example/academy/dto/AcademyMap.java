package com.example.academy.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AcademyMap {
    private int mapId;
    private int branchId;
    private String mapUrl;
}
