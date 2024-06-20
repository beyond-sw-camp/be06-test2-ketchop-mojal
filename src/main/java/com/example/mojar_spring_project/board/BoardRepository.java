package com.example.mojar_spring_project.board;
//DB관련된 곳!!!
import com.example.mojar_spring_project.board.model.BoardCreateReq;
import com.example.mojar_spring_project.board.model.BoardReadRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class BoardRepository {
    JdbcTemplate jdbcTemplate;
    DataSource dataSource;

    //의존성주입
    public BoardRepository(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    //게시물전체조회
    public List<BoardReadRes> findAll(){
        //조회한것을 응답객체변수에 담아서 전달
        List<BoardReadRes> boardReadRes = jdbcTemplate.query(
                "SELECT * FROM mojalex.board",
                (rs,rownum)->{
                    BoardReadRes response = new BoardReadRes(
                            rs.getString("title"),
                            rs.getString("contents"),
                            rs.getInt("max_capacity"),
                            rs.getInt("post_type"),
                            rs.getInt("user_idx")
                    );
                    return response;
                }
        );
        return boardReadRes;
    };

    //특정게시물조회
    public List<BoardReadRes> findById(Integer idx){
        List<BoardReadRes> boardReadRes = jdbcTemplate.query(
                "SELECT * FROM board LEFT JOIN member ON mojalex.board.user_idx = mojalex.member.idx WHERE mojalex.member.idx=?",
                (rs,rownum)->{
                    BoardReadRes response = new BoardReadRes(
                            rs.getString("title"),
                            rs.getString("contents"),
                            rs.getInt("max_capacity"),
                            rs.getInt("post_type"),
                            rs.getInt("user_idx")
                    );
                    return response;
                },
                idx
        );
        return boardReadRes;
    }
}
