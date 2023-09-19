package com.example.academy;

import com.example.academy.dto.Board;
import com.example.academy.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardTests {

    @Autowired
    BoardService boardService;

    @Test
    void contextLoads() {
        boardService.deleteAll();
        for (int i = 1; i <= 300; i++) {
            String title = String.format("테스트 데이터입니다:[%03d]", i);
            String author = "다솜";
            String content = "테스트 내용";
            // boardPassword 등 다른 필요한 필드 설정

            Board board = new Board();
            board.setTitle(title);
            board.setAuthor(author);
            board.setContent(content);
            // boardPassword 등 다른 필드 설정


            board.setBoardType(Board.BoardType.ONLINE_COUNSELING);

            boardService.create(board);
        }

    }
}
