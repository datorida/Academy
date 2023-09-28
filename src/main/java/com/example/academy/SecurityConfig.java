package com.example.academy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터체인에 등록이 됨
public class SecurityConfig {

    @Bean
    public SecurityFilterChain  defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/adminLogin").permitAll() // 관리자 로그인 페이지는 모든 사용자에게 허용
                .requestMatchers("/").permitAll()
                .and()
                .formLogin()
                .loginPage("/adminLogin")
                .loginProcessingUrl("/login_proc")
                .permitAll()
                .and()
                .sessionManagement()
                .sessionFixation().migrateSession() // 세션 고정 보호를 사용자가 로그인할 때 새 세션으로 마이그레이션하도록 설정
                .maximumSessions(1)
                .maxSessionsPreventsLogin(false)
                .expiredUrl("/adminLogin?expired")
                .and()
                .and()
                .logout()
                .logoutSuccessUrl("/adminLogin?logout")
                .permitAll();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
