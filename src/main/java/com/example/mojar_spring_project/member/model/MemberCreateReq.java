package com.example.mojar_spring_project.member.model;

public class MemberCreateReq {
    String email;
    String password;
    String name;
    int userIdx;

    public MemberCreateReq() {
    }

    public MemberCreateReq(String email, String password, String name, int userIdx) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.userIdx = userIdx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }
}
