package com.example.mojar_spring_project.board;

import com.example.mojar_spring_project.board.model.BoardReadRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/board")
public class BoardController {
    BoardService boardService;

    //의존성주입
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    //게시물조회
    @RequestMapping(method = RequestMethod.GET, value = "/read")
    public ResponseEntity<List<BoardReadRes>> read(Integer idx){
        List<BoardReadRes> response = boardService.read(idx);
        return ResponseEntity.ok(response);
    };

    //전체조회
    @RequestMapping(method = RequestMethod.GET, value = "/readAll")
    public ResponseEntity<List<BoardReadRes>> readAll(){
        List<BoardReadRes> response = boardService.readAll();
        return ResponseEntity.ok(response);
    };

}
