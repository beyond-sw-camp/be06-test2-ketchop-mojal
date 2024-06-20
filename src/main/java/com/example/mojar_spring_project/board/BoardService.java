package com.example.mojar_spring_project.board;
//HTTP요청응답처리하는곳!!!
import com.example.mojar_spring_project.board.model.BoardReadRes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    BoardRepository boardRepository;

    //의존성주입
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //전체조회
    public List<BoardReadRes> readAll(){
      List<BoardReadRes> boardReadRes = boardRepository.findAll();
      return boardReadRes;
    };

    //특정게시물조회
    public List<BoardReadRes> read(Integer idx){
        List<BoardReadRes> boardReadRes = boardRepository.findById(idx);
        return boardReadRes;
    };
}
