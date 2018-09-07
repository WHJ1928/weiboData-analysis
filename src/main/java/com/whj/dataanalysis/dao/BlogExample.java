package com.whj.dataanalysis.dao;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLikesNumIsNull() {
            addCriterion("likes_num is null");
            return (Criteria) this;
        }

        public Criteria andLikesNumIsNotNull() {
            addCriterion("likes_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikesNumEqualTo(String value) {
            addCriterion("likes_num =", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotEqualTo(String value) {
            addCriterion("likes_num <>", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumGreaterThan(String value) {
            addCriterion("likes_num >", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumGreaterThanOrEqualTo(String value) {
            addCriterion("likes_num >=", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumLessThan(String value) {
            addCriterion("likes_num <", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumLessThanOrEqualTo(String value) {
            addCriterion("likes_num <=", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumLike(String value) {
            addCriterion("likes_num like", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotLike(String value) {
            addCriterion("likes_num not like", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumIn(List<String> values) {
            addCriterion("likes_num in", values, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotIn(List<String> values) {
            addCriterion("likes_num not in", values, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumBetween(String value1, String value2) {
            addCriterion("likes_num between", value1, value2, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotBetween(String value1, String value2) {
            addCriterion("likes_num not between", value1, value2, "likesNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(String value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(String value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(String value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(String value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(String value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(String value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLike(String value) {
            addCriterion("comment_num like", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotLike(String value) {
            addCriterion("comment_num not like", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<String> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<String> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(String value1, String value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(String value1, String value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumIsNull() {
            addCriterion("forward_num is null");
            return (Criteria) this;
        }

        public Criteria andForwardNumIsNotNull() {
            addCriterion("forward_num is not null");
            return (Criteria) this;
        }

        public Criteria andForwardNumEqualTo(String value) {
            addCriterion("forward_num =", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotEqualTo(String value) {
            addCriterion("forward_num <>", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumGreaterThan(String value) {
            addCriterion("forward_num >", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumGreaterThanOrEqualTo(String value) {
            addCriterion("forward_num >=", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumLessThan(String value) {
            addCriterion("forward_num <", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumLessThanOrEqualTo(String value) {
            addCriterion("forward_num <=", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumLike(String value) {
            addCriterion("forward_num like", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotLike(String value) {
            addCriterion("forward_num not like", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumIn(List<String> values) {
            addCriterion("forward_num in", values, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotIn(List<String> values) {
            addCriterion("forward_num not in", values, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumBetween(String value1, String value2) {
            addCriterion("forward_num between", value1, value2, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotBetween(String value1, String value2) {
            addCriterion("forward_num not between", value1, value2, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagIsNull() {
            addCriterion("original_flag is null");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagIsNotNull() {
            addCriterion("original_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagEqualTo(String value) {
            addCriterion("original_flag =", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagNotEqualTo(String value) {
            addCriterion("original_flag <>", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagGreaterThan(String value) {
            addCriterion("original_flag >", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagGreaterThanOrEqualTo(String value) {
            addCriterion("original_flag >=", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagLessThan(String value) {
            addCriterion("original_flag <", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagLessThanOrEqualTo(String value) {
            addCriterion("original_flag <=", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagLike(String value) {
            addCriterion("original_flag like", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagNotLike(String value) {
            addCriterion("original_flag not like", value, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagIn(List<String> values) {
            addCriterion("original_flag in", values, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagNotIn(List<String> values) {
            addCriterion("original_flag not in", values, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagBetween(String value1, String value2) {
            addCriterion("original_flag between", value1, value2, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andOriginalFlagNotBetween(String value1, String value2) {
            addCriterion("original_flag not between", value1, value2, "originalFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(String value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(String value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(String value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(String value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLike(String value) {
            addCriterion("created_time like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotLike(String value) {
            addCriterion("created_time not like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<String> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<String> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(String value1, String value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}