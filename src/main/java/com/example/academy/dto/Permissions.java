package com.example.academy.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Permissions {
    private int permissionsId;
    private String permissionName;
    private Date modifiedDate;
    private Date createdDate;
}
