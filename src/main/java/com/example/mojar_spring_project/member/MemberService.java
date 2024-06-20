package com.example.mojar_spring_project.member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
