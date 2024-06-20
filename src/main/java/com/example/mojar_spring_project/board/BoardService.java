package com.example.mojar_spring_project.board;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
    BoardService boardService;

    public BoardService(BoardService boardService) {
        this.boardService = boardService;
    }
}
