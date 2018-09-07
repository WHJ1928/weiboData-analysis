package com.whj.dataanalysis.dao;

public class BlogWithBLOBs extends Blog {
    private String blogAdd;

    private String text;

    public String getBlogAdd() {
        return blogAdd;
    }

    public void setBlogAdd(String blogAdd) {
        this.blogAdd = blogAdd == null ? null : blogAdd.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}