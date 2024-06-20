package com.example.mojar_spring_project.board;

import com.example.mojar_spring_project.board.model.BoardCreateReq;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {
    JdbcTemplate jdbcTemplate;

    public BoardRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(BoardCreateReq dto) {
        int result = jdbcTemplate.update("INSERT INTO board(title, contents, post_type, user_idx) VALUES (?, ?, ?, ?)",
                dto.getTitle(),
                dto.getContents(),
                dto.getPostType(),
                dto.getUserIdx()
        );
        return result;
    }
}
