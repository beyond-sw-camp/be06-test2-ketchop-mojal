package com.example.mojar_spring_project.board.model;

public class BoardCreateRes {
    String title;

    public BoardCreateRes() {
    }

    public BoardCreateRes(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
