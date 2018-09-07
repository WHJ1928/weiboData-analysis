package com.whj.dataanalysis.dao;

public class Blog {
    private String blogId;

    private String userId;

    private String likesNum;

    private String commentNum;

    private String forwardNum;

    private String originalFlag;

    private String createdTime;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLikesNum() {
        return likesNum;
    }

    public void setLikesNum(String likesNum) {
        this.likesNum = likesNum == null ? null : likesNum.trim();
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum == null ? null : commentNum.trim();
    }

    public String getForwardNum() {
        return forwardNum;
    }

    public void setForwardNum(String forwardNum) {
        this.forwardNum = forwardNum == null ? null : forwardNum.trim();
    }

    public String getOriginalFlag() {
        return originalFlag;
    }

    public void setOriginalFlag(String originalFlag) {
        this.originalFlag = originalFlag == null ? null : originalFlag.trim();
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }
}