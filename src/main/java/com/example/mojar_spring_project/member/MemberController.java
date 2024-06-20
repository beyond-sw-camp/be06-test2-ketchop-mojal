package com.example.mojar_spring_project.member;

import com.example.mojar_spring_project.member.model.MemberCreateReq;
import com.example.mojar_spring_project.member.model.MemberCreateRes;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="member")
public class MemberController {
    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public ResponseEntity<String> signup(@RequestBody MemberCreateReq memberCreateReq){
        String ret = memberService.signup(memberCreateReq);
        return ResponseEntity.ok(ret);
    }

}
