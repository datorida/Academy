package com.example.academy.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId; // 글 번호 (주요 식별자로 변경)
    private String title; // 제목
    private String author; // 작성자
    private LocalDateTime createdAt; // 등록일
    @Column(columnDefinition = "integer default 0", nullable = false)
    private int viewCount; // 조회수
    private String content; // 내용
    private String boardPassword; // 비밀번호
    private boolean secret;
    @Column(name = "boardType")
    @Enumerated(EnumType.STRING) // ENUM 값을 문자열로 저장
    private BoardType boardType; // 게시판 타입 (ENUM)

    // Getter와 Setter 메서드 추가
    public boolean isSecret() {
        return secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public void getBoardType(String boardType) {
    }

    // 게시판 타입을 위한 ENUM 정의
    public enum BoardType {
        ONLINE_COUNSELING,
        COMPLAINT_COUNSELING,
        NOTICE,
        COMPLAINT_COUNSELING_COUNSELING, FREE_BOARD
    }
}
