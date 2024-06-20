package com.example.mojar_spring_project.member;


import com.example.mojar_spring_project.member.model.MemberLoginReq;
import com.example.mojar_spring_project.member.model.MemberLoginRes;

import com.example.mojar_spring_project.member.model.MemberCreateReq;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class MemberRepository {

    private JdbcTemplate jdbcTemplate;

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


    public MemberRepository(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    public int signup(MemberCreateReq memberCreateReq){
        int result = jdbcTemplate.update("INSERT INTO user (email, password, nickname) VALUES (?, ?, ?)",
                memberCreateReq.getEmail(),
                memberCreateReq.getPassword(),
                memberCreateReq.getNickname()
        );

        return result;

    }
}
