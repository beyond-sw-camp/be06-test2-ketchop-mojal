package com.example.mojar_spring_project.member.model;

public class MemberLoginReq {
    String email;
    String password;

    public MemberLoginReq() {
    }

    public MemberLoginReq(String email, String password) {
        this.email = email;
        this.password = password;
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
}
