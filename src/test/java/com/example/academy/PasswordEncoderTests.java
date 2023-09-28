package com.example.academy;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordEncoderTests {
    @Test
    public void testPasswordMatching(){
        //비밀번호를 해싱하는 BCrpytPasswordEncoder생성
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        //원본 비밀번호
        String rawPassword="admin";

        //비밀번호를 해싱하여 저장
        String hashedPassword= passwordEncoder.encode(rawPassword);

        //저장된 해싱된 비밀번호와 입력된 비밀번호를 비교
        boolean passwordMatches=passwordEncoder.matches(rawPassword, hashedPassword);

        //비밀번호가 일치해야함
        assertTrue(passwordMatches);
    }
}
