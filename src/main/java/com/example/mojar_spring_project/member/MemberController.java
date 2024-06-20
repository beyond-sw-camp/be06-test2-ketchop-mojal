package com.example.mojar_spring_project.member;

import com.example.mojar_spring_project.member.model.MemberLoginReq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/member")
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ResponseEntity<String> login(@RequestBody MemberLoginReq memberLoginReq) {

        String logincheck = memberService.login(memberLoginReq);

        return ResponseEntity.ok(logincheck);
    }
}
