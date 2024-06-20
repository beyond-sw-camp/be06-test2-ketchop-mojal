package com.example.mojar_spring_project.board;

import com.example.mojar_spring_project.board.model.BoardCreateReq;
import com.example.mojar_spring_project.board.model.BoardCreateRes;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public String create(BoardCreateReq dto) {
        // 처리
        // DB에 저장
        int result = boardRepository.save(dto);
        if (result !=0) {
            String ret = dto.getTitle()+"저장됨";
//            BoardCreateRes boardCreateRes = new BoardCreateRes(dto.getTitle());
            return ret;
        }else{
            String ret = dto.getTitle()+"저장안됨";
//            BoardCreateRes boardCreateRes = new BoardCreateRes(dto.getTitle());
            return ret;
        }
    }

}
