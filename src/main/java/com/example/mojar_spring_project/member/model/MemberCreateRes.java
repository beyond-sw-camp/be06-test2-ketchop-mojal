package com.example.mojar_spring_project.member.model;

public class MemberCreateRes {
    String name;

    public MemberCreateRes() {
    }

    public MemberCreateRes(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
