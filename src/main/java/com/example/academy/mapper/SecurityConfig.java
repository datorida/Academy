package com.example.academy.mapper;


import com.example.academy.service.UserPermissionsService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public abstract class SecurityConfig extends WebSecurityConfigurerAdapter {
    private UserPermissionsService userPermissionService;

    public SecurityConfig(UserPermissionsService userPermissionService){
        this.userPermissionService= userPermissionService;
    }



}
