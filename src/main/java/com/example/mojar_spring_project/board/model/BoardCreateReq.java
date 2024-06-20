package com.example.mojar_spring_project.board.model;

public class BoardCreateReq {
    String title;
    String content;
    String userIdx;

    public BoardCreateReq() {
    }

    public BoardCreateReq(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BoardCreateReq(String title, String content, String userIdx) {
        this.title = title;
        this.content = content;
        this.userIdx = userIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(String userIdx) {
        this.userIdx = userIdx;
    }
}
