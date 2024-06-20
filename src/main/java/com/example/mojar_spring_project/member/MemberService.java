package com.example.mojar_spring_project.member;

import com.example.mojar_spring_project.member.model.MemberCreateReq;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String signup(MemberCreateReq memberCreateReq){
        int result = memberRepository.signup(memberCreateReq);
        String ret;
        if(result>0){
            ret = memberCreateReq.getNickname()+"님 회원가입 완료";
        }else{
            ret = "회원가입 실패";
        }
        return ret;
    }
}
