package com.example.academy.user;

import com.example.academy.dto.Board;
import com.example.academy.service.BoardService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user/counseling")
public class CounselingController {
    @Autowired
    BoardService boardService;


    @GetMapping("/online/list")
    public String online(Model model, @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable,
                         @RequestParam(required = false, defaultValue = "") String searchText)  {

        Page<Board> onlineBoards;
        if (StringUtils.isBlank(searchText)) { //문자열이 비어 있거나 공백 문자(whitespace)로만 구성되어 있는지를 확인
            // 검색어가 비어 있을 때는 모든 "온라인" 게시물을 가져옵니다.
            onlineBoards = boardService.findByBoardType(Board.BoardType.ONLINE_COUNSELING, pageable);
        } else {
            // 검색어가 있는 경우에는 검색어를 포함하는 "온라인" 게시물만 가져옵니다.
            onlineBoards = boardService.findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(
                    searchText, searchText, searchText, Board.BoardType.ONLINE_COUNSELING, pageable
            );
        }
        System.out.println(onlineBoards);
        int startPage = Math.max(1, onlineBoards.getPageable().getPageNumber() - 3);
        int endPage = Math.min(onlineBoards.getTotalPages(), onlineBoards.getPageable().getPageNumber() + 3);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("boards", onlineBoards);
        return "user/counseling/online/list";
    }

    @PostMapping("/confirm")
    public String save(@ModelAttribute Board board, Model model, @RequestParam(value = "secret", required = false) boolean secret
            , @RequestParam(name="boardType", required = false)Board.BoardType boardType) {
        board.setSecret(secret);
        board.setBoardType(boardType);
        boardService.saveBoard(board);

        // 글을 등록한 후에 최신 글 목록을 다시 가져와서 업데이트
        Page<Board> boards = boardService.findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(
                "", "", "",Board.BoardType.ONLINE_COUNSELING, PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createdAt"))
        );

        int startPage = Math.max(1, boards.getPageable().getPageNumber() - 3);
        int endPage = Math.min(boards.getTotalPages(), boards.getPageable().getPageNumber() + 3);

        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("boards", boards);

        return "user/counseling/online/list";
}

    @PostMapping("/complaintSave")
    public String complaintSave(@ModelAttribute Board board, Model model, @RequestParam(value = "secret", required = false) boolean secret
            , @RequestParam(name="boardType", required = false)Board.BoardType boardType,
                                @RequestParam(required = false, defaultValue = "") String searchText) {
        board.setSecret(secret);
        board.setBoardType(boardType);
        boardService.saveBoard(board);


        // 글을 등록한 후에 최신 글 목록을 다시 가져와서 업데이트
        Page<Board> boards = boardService.findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(
                "", "", "", Board.BoardType.COMPLAINT_COUNSELING_COUNSELING, PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createdAt"))
        );


        int startPage = Math.max(1, boards.getPageable().getPageNumber() - 3);
        int endPage = Math.min(boards.getTotalPages(), boards.getPageable().getPageNumber() + 3);

        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("boards", boards);

        return "user/counseling/complaint/list";
    }



    //글작성
    @GetMapping("/online/write")
    public String write(Model model) {

        return "user/counseling/online/write";
    }

    @GetMapping("/complaint/write")
    public String complaintWrite(Model model) {

        return "user/counseling/complaint/write";
    }

    //온라인상담 특정 게시글보기
    @GetMapping("/online/boardView")
    public String boardView(Model model, @RequestParam Long boardId) {
        Board boardView = boardService.searchBoardList(boardId); // 조회수 증가를 서비스에서 처리
        model.addAttribute("boardView", boardView);

        return "user/counseling/online/boardView";
    }

    // 고충상담 특정 게시글보기
    @GetMapping("/complaint/boardView")
    public String complaintBoardView(Model model, @RequestParam Long boardId){
        Board boardView=boardService.searchBoardList(boardId);
        model.addAttribute("boardView", boardView);
        return "user/counseling/complaint/boardView";
    }


    // 삭제 버튼 클릭 시 게시글 삭제 요청

    @PostMapping("/deleteBoard")
    public ResponseEntity<String> complaintDeleteBoard(@RequestParam Long boardId, @RequestParam String boardType, Model model) {
        try {
            // 게시글 삭제
            boardService.deleteBoard(boardId);
            Board board = new Board();
            board.getBoardType(boardType);
            // 삭제 후에 새로운 페이지 정보와 글 목록을 가져옴
            Page<Board> boards = boardService.findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(
                    "", "", "", board.getBoardType(), PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createdAt"))
            );
            int startPage = Math.max(1, boards.getPageable().getPageNumber() - 3);
            int endPage = Math.min(boards.getTotalPages(), boards.getPageable().getPageNumber() + 3);

            // 새로운 정보를 모델에 추가
            model.addAttribute("startPage", startPage);
            model.addAttribute("endPage", endPage);
            model.addAttribute("boards", boards);

            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
        }
    }


    //고충상담 리스트
    @GetMapping("/complaint/list")
    public String complaintBoardView(Model model, @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable,
                                     @RequestParam(required = false, defaultValue = "") String searchText)  {
        Page<Board> complaintBoards;
        if (StringUtils.isBlank(searchText)) {
            // 검색어가 비어 있을 때는 모든 "고충상담" 게시물을 가져옵니다.
            complaintBoards = boardService.findByBoardType(Board.BoardType.COMPLAINT_COUNSELING, pageable);
        } else {
            // 검색어가 있는 경우에는 검색어를 포함하는 "고충상담" 게시물만 가져옵니다.
            complaintBoards = boardService.findByTitleContainingOrContentContainingOrAuthorContainingAndBoardType(
                    searchText, searchText, searchText, Board.BoardType.COMPLAINT_COUNSELING, pageable
            );
        }
        int startPage = Math.max(1, complaintBoards.getPageable().getPageNumber() - 3);
        int endPage = Math.min(complaintBoards.getTotalPages(), complaintBoards.getPageable().getPageNumber() + 3);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("boards", complaintBoards);
        return "user/counseling/complaint/list";
    }



    @GetMapping("/application")
    public String application(Model model) {

        return "user/counseling/application";
    }

}
