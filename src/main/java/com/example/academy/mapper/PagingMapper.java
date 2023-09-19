package com.example.academy.mapper;

import com.example.academy.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PagingMapper extends JpaRepository<Board, Integer> {


    //게시판 페이징
    Page<Board> findAll(Pageable pageable);

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content);

    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

    Page<Board> findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(String title, String content, String author, Board.BoardType boardType, Pageable pageable);

    Page<Board> findByBoardType(Board.BoardType boardType, Pageable pageable);

}
