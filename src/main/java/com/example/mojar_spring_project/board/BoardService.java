package com.example.mojar_spring_project.board;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
    BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
}
