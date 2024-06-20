package com.example.mojar_spring_project.member;

import com.example.mojar_spring_project.member.model.MemberLoginReq;
import com.example.mojar_spring_project.member.model.MemberLoginRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    private JdbcTemplate jdbcTemplate;

    public MemberRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 로그인 기능
    public MemberLoginRes login(MemberLoginReq dtoReq) { // 유저테이블 이름 고치기!
        MemberLoginRes dtoRes = jdbcTemplate.queryForObject("SELECT * FROM usermj WHERE email = ? AND password = ?",
                (rs, rowNum) -> {
                    MemberLoginRes response = new MemberLoginRes(
                            rs.getString("email"),
                            rs.getString("password"),
                            rs.getString("nickname")
                    );
                    return response;
                },
                dtoReq.getEmail(),
                dtoReq.getPassword()
        );
        return dtoRes;
    }
}
