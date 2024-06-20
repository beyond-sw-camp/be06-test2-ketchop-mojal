package com.example.mojar_spring_project.board;

import com.example.mojar_spring_project.board.model.BoardCreateReq;
import com.example.mojar_spring_project.board.model.BoardCreateRes;
import com.example.mojar_spring_project.board.model.BoardReadRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/board")
public class BoardController {
    BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ResponseEntity<String> create(@RequestBody BoardCreateReq dto){
        String response = boardService.create(dto);
        return ResponseEntity.ok(response);
    }

}
