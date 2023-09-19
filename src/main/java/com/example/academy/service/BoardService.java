package com.example.academy.service;

import com.example.academy.dto.Board;
import com.example.academy.frame.MyService;
import com.example.academy.mapper.BoardMapper;
import com.example.academy.mapper.PagingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BoardService implements MyService<Integer, Board> {

    @Autowired
    BoardMapper boardMapper;

    @Autowired
    PagingMapper pagingMapper;


    @Override
    public void register(Board board) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Board board) throws Exception {

    }


    @Override
    public Board get(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Board> get() throws Exception {
        return null;
    }

    //게시글 리스트 페이지 처리


    public Board create(Board board) {
        // 생성 시간 설정
        board.setCreatedAt(LocalDateTime.now());
        // 조회수 초기값 설정
        board.setViewCount(0);

        // 게시물을 저장하고 저장된 엔티티를 반환
        return pagingMapper.save(board);
    }


    public Board getBoardByBoardId(Long boardId) {

        return boardMapper.getBoardByBoardId(boardId);
    }

    public void saveBoard(Board board) {

        boardMapper.save(board);
    }


    public Page<Board> findAll(Pageable pageable) {

        return pagingMapper.findAll(pageable);
    }

    public Page<Board> findByTitleContainingOrContentContaining(String searchText, String searchText1, Pageable pageable) {
        return pagingMapper.findByTitleContainingOrContentContaining(searchText, searchText, pageable);
    }

    public Page<Board> findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(String searchText, String searchText1, String searchText2, Board.BoardType boardType,Pageable pageable) {
        return pagingMapper.findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(searchText, searchText1, searchText2, boardType, pageable);
    }



    public Board searchBoardList(Long bordId) {

        return boardMapper.searchBoardList(bordId);
    }



    public void deleteAll() {
        boardMapper.deleteAll();
    }


    public void saveEditedContent(Long boardId, String content) {
        boardMapper.saveEditedContent(boardId, content);
    }

    public void deleteBoard(Long boardId) {
        boardMapper.delete(boardId);
    }

    public Page<Board> findByBoardType(Board.BoardType boardType, Pageable pageable) {
        return pagingMapper.findByBoardType(boardType,pageable);
    }
}