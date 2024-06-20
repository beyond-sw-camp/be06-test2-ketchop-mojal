package com.example.mojar_spring_project.member;

import com.example.mojar_spring_project.member.model.MemberCreateReq;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class MemberRepository {
    JdbcTemplate jdbcTemplate;
    DataSource dataSource;

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
