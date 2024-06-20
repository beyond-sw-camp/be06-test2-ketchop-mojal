package com.example.mojar_spring_project.member;

import com.example.mojar_spring_project.member.model.MemberLoginReq;
import com.example.mojar_spring_project.member.model.MemberLoginRes;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String login(MemberLoginReq memberLoginReq) {
        // DB에서 조회
        MemberLoginRes checkRes = memberRepository.login(memberLoginReq);

        if(checkRes != null) {
            return checkRes.getNickname()+"님, 안녕하세요?";
        }
        // 회원이 없을 때 처리해줘야 함 아마 트라이캐치로 예외처리
        return "누구세요??";

    }
}
