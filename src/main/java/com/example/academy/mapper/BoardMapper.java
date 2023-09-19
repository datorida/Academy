package com.example.academy.mapper;

import com.example.academy.dto.Board;
import com.example.academy.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper extends MyMapper<Integer, Board> {
    void insert(Board board) throws Exception;
    void delete(Integer integer) throws Exception;
    void update(Board board) throws Exception;
    Board select(Integer integer) throws Exception;
    List<Board> selectAll() throws Exception;

    Board getBoardByBoardId(Long boardId);

    void save(Board board);

    void saveViewCount(Board board);

    void deleteAll();

    Board searchBoardList(Long bordId);


    void saveEditedContent(Long boardId, String content);


    void delete(Long boardId);
}
