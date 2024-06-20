package com.example.mojar_spring_project.board.model;

public class BoardReadRes {
    String title;
    String content;
    Integer max_capacity;
    Integer post_type;
    Integer user_idx;

    public BoardReadRes() {
    }

    public BoardReadRes(String title, String content, int post_type, int user_idx) {
        this.title = title;
        this.content = content;
        this.post_type = post_type;
        this.user_idx = user_idx;
    }

    public BoardReadRes(String title, String content, int max_capacity, int post_type, int user_idx) {
        this.title = title;
        this.content = content;
        this.post_type = post_type;
        this.user_idx = user_idx;
        this.max_capacity = max_capacity;
    }

    public int getPost_type() {
        return post_type;
    }

    public void setPost_type(int post_type) {
        this.post_type = post_type;
    }

    public int getUser_idx() {
        return user_idx;
    }

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
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

}
