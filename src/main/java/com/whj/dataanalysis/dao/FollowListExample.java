package com.whj.dataanalysis.dao;

import java.util.ArrayList;
import java.util.List;

public class FollowListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowListExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andFollowUserIdIsNull() {
            addCriterion("follow_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIsNotNull() {
            addCriterion("follow_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdEqualTo(String value) {
            addCriterion("follow_user_id =", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotEqualTo(String value) {
            addCriterion("follow_user_id <>", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdGreaterThan(String value) {
            addCriterion("follow_user_id >", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("follow_user_id >=", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLessThan(String value) {
            addCriterion("follow_user_id <", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLessThanOrEqualTo(String value) {
            addCriterion("follow_user_id <=", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdLike(String value) {
            addCriterion("follow_user_id like", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotLike(String value) {
            addCriterion("follow_user_id not like", value, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdIn(List<String> values) {
            addCriterion("follow_user_id in", values, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotIn(List<String> values) {
            addCriterion("follow_user_id not in", values, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdBetween(String value1, String value2) {
            addCriterion("follow_user_id between", value1, value2, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUserIdNotBetween(String value1, String value2) {
            addCriterion("follow_user_id not between", value1, value2, "followUserId");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameIsNull() {
            addCriterion("follow_username is null");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameIsNotNull() {
            addCriterion("follow_username is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameEqualTo(String value) {
            addCriterion("follow_username =", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameNotEqualTo(String value) {
            addCriterion("follow_username <>", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameGreaterThan(String value) {
            addCriterion("follow_username >", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("follow_username >=", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameLessThan(String value) {
            addCriterion("follow_username <", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameLessThanOrEqualTo(String value) {
            addCriterion("follow_username <=", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameLike(String value) {
            addCriterion("follow_username like", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameNotLike(String value) {
            addCriterion("follow_username not like", value, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameIn(List<String> values) {
            addCriterion("follow_username in", values, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameNotIn(List<String> values) {
            addCriterion("follow_username not in", values, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameBetween(String value1, String value2) {
            addCriterion("follow_username between", value1, value2, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUsernameNotBetween(String value1, String value2) {
            addCriterion("follow_username not between", value1, value2, "followUsername");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansIsNull() {
            addCriterion("follow_user_fans is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansIsNotNull() {
            addCriterion("follow_user_fans is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansEqualTo(String value) {
            addCriterion("follow_user_fans =", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansNotEqualTo(String value) {
            addCriterion("follow_user_fans <>", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansGreaterThan(String value) {
            addCriterion("follow_user_fans >", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansGreaterThanOrEqualTo(String value) {
            addCriterion("follow_user_fans >=", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansLessThan(String value) {
            addCriterion("follow_user_fans <", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansLessThanOrEqualTo(String value) {
            addCriterion("follow_user_fans <=", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansLike(String value) {
            addCriterion("follow_user_fans like", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansNotLike(String value) {
            addCriterion("follow_user_fans not like", value, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansIn(List<String> values) {
            addCriterion("follow_user_fans in", values, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansNotIn(List<String> values) {
            addCriterion("follow_user_fans not in", values, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansBetween(String value1, String value2) {
            addCriterion("follow_user_fans between", value1, value2, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFansNotBetween(String value1, String value2) {
            addCriterion("follow_user_fans not between", value1, value2, "followUserFans");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolIsNull() {
            addCriterion("follow_user_fol is null");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolIsNotNull() {
            addCriterion("follow_user_fol is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolEqualTo(String value) {
            addCriterion("follow_user_fol =", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolNotEqualTo(String value) {
            addCriterion("follow_user_fol <>", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolGreaterThan(String value) {
            addCriterion("follow_user_fol >", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolGreaterThanOrEqualTo(String value) {
            addCriterion("follow_user_fol >=", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolLessThan(String value) {
            addCriterion("follow_user_fol <", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolLessThanOrEqualTo(String value) {
            addCriterion("follow_user_fol <=", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolLike(String value) {
            addCriterion("follow_user_fol like", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolNotLike(String value) {
            addCriterion("follow_user_fol not like", value, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolIn(List<String> values) {
            addCriterion("follow_user_fol in", values, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolNotIn(List<String> values) {
            addCriterion("follow_user_fol not in", values, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolBetween(String value1, String value2) {
            addCriterion("follow_user_fol between", value1, value2, "followUserFol");
            return (Criteria) this;
        }

        public Criteria andFollowUserFolNotBetween(String value1, String value2) {
            addCriterion("follow_user_fol not between", value1, value2, "followUserFol");
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