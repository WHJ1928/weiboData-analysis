package com.whj.dataanalysis.dao;

public class FollowList {
    private String id;

    private String userId;

    private String followUserId;

    private String followUsername;

    private String followUserFans;

    private String followUserFol;

    private String mutualFans;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(String followUserId) {
        this.followUserId = followUserId == null ? null : followUserId.trim();
    }

    public String getFollowUsername() {
        return followUsername;
    }

    public void setFollowUsername(String followUsername) {
        this.followUsername = followUsername == null ? null : followUsername.trim();
    }

    public String getFollowUserFans() {
        return followUserFans;
    }

    public void setFollowUserFans(String followUserFans) {
        this.followUserFans = followUserFans == null ? null : followUserFans.trim();
    }

    public String getFollowUserFol() {
        return followUserFol;
    }

    public void setFollowUserFol(String followUserFol) {
        this.followUserFol = followUserFol == null ? null : followUserFol.trim();
    }

    public String getMutualFans() {
        return mutualFans;
    }

    public void setMutualFans(String mutualFans) {
        this.mutualFans = mutualFans == null ? null : mutualFans.trim();
    }
}