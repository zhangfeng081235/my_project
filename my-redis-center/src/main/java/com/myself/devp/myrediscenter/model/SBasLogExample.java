package com.myself.devp.myrediscenter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SBasLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SBasLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("LOG_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("LOG_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNull() {
            addCriterion("CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIsNotNull() {
            addCriterion("CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserEqualTo(String value) {
            addCriterion("CRT_USER =", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotEqualTo(String value) {
            addCriterion("CRT_USER <>", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThan(String value) {
            addCriterion("CRT_USER >", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_USER >=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThan(String value) {
            addCriterion("CRT_USER <", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLessThanOrEqualTo(String value) {
            addCriterion("CRT_USER <=", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserLike(String value) {
            addCriterion("CRT_USER like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotLike(String value) {
            addCriterion("CRT_USER not like", value, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserIn(List<String> values) {
            addCriterion("CRT_USER in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotIn(List<String> values) {
            addCriterion("CRT_USER not in", values, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserBetween(String value1, String value2) {
            addCriterion("CRT_USER between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtUserNotBetween(String value1, String value2) {
            addCriterion("CRT_USER not between", value1, value2, "crtUser");
            return (Criteria) this;
        }

        public Criteria andCrtOrgIsNull() {
            addCriterion("CRT_ORG is null");
            return (Criteria) this;
        }

        public Criteria andCrtOrgIsNotNull() {
            addCriterion("CRT_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andCrtOrgEqualTo(String value) {
            addCriterion("CRT_ORG =", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgNotEqualTo(String value) {
            addCriterion("CRT_ORG <>", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgGreaterThan(String value) {
            addCriterion("CRT_ORG >", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgGreaterThanOrEqualTo(String value) {
            addCriterion("CRT_ORG >=", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgLessThan(String value) {
            addCriterion("CRT_ORG <", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgLessThanOrEqualTo(String value) {
            addCriterion("CRT_ORG <=", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgLike(String value) {
            addCriterion("CRT_ORG like", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgNotLike(String value) {
            addCriterion("CRT_ORG not like", value, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgIn(List<String> values) {
            addCriterion("CRT_ORG in", values, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgNotIn(List<String> values) {
            addCriterion("CRT_ORG not in", values, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgBetween(String value1, String value2) {
            addCriterion("CRT_ORG between", value1, value2, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtOrgNotBetween(String value1, String value2) {
            addCriterion("CRT_ORG not between", value1, value2, "crtOrg");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("CRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("CRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterion("CRT_DATE =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterion("CRT_DATE <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterion("CRT_DATE >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterion("CRT_DATE <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterion("CRT_DATE in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterion("CRT_DATE not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE not between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOperateKeyIsNull() {
            addCriterion("OPERATE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andOperateKeyIsNotNull() {
            addCriterion("OPERATE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andOperateKeyEqualTo(String value) {
            addCriterion("OPERATE_KEY =", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotEqualTo(String value) {
            addCriterion("OPERATE_KEY <>", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyGreaterThan(String value) {
            addCriterion("OPERATE_KEY >", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_KEY >=", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyLessThan(String value) {
            addCriterion("OPERATE_KEY <", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_KEY <=", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyLike(String value) {
            addCriterion("OPERATE_KEY like", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotLike(String value) {
            addCriterion("OPERATE_KEY not like", value, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyIn(List<String> values) {
            addCriterion("OPERATE_KEY in", values, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotIn(List<String> values) {
            addCriterion("OPERATE_KEY not in", values, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyBetween(String value1, String value2) {
            addCriterion("OPERATE_KEY between", value1, value2, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateKeyNotBetween(String value1, String value2) {
            addCriterion("OPERATE_KEY not between", value1, value2, "operateKey");
            return (Criteria) this;
        }

        public Criteria andOperateMethodIsNull() {
            addCriterion("OPERATE_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andOperateMethodIsNotNull() {
            addCriterion("OPERATE_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andOperateMethodEqualTo(String value) {
            addCriterion("OPERATE_METHOD =", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodNotEqualTo(String value) {
            addCriterion("OPERATE_METHOD <>", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodGreaterThan(String value) {
            addCriterion("OPERATE_METHOD >", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_METHOD >=", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodLessThan(String value) {
            addCriterion("OPERATE_METHOD <", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_METHOD <=", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodLike(String value) {
            addCriterion("OPERATE_METHOD like", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodNotLike(String value) {
            addCriterion("OPERATE_METHOD not like", value, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodIn(List<String> values) {
            addCriterion("OPERATE_METHOD in", values, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodNotIn(List<String> values) {
            addCriterion("OPERATE_METHOD not in", values, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodBetween(String value1, String value2) {
            addCriterion("OPERATE_METHOD between", value1, value2, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateMethodNotBetween(String value1, String value2) {
            addCriterion("OPERATE_METHOD not between", value1, value2, "operateMethod");
            return (Criteria) this;
        }

        public Criteria andOperateContentIsNull() {
            addCriterion("OPERATE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andOperateContentIsNotNull() {
            addCriterion("OPERATE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andOperateContentEqualTo(String value) {
            addCriterion("OPERATE_CONTENT =", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentNotEqualTo(String value) {
            addCriterion("OPERATE_CONTENT <>", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentGreaterThan(String value) {
            addCriterion("OPERATE_CONTENT >", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_CONTENT >=", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentLessThan(String value) {
            addCriterion("OPERATE_CONTENT <", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_CONTENT <=", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentLike(String value) {
            addCriterion("OPERATE_CONTENT like", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentNotLike(String value) {
            addCriterion("OPERATE_CONTENT not like", value, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentIn(List<String> values) {
            addCriterion("OPERATE_CONTENT in", values, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentNotIn(List<String> values) {
            addCriterion("OPERATE_CONTENT not in", values, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentBetween(String value1, String value2) {
            addCriterion("OPERATE_CONTENT between", value1, value2, "operateContent");
            return (Criteria) this;
        }

        public Criteria andOperateContentNotBetween(String value1, String value2) {
            addCriterion("OPERATE_CONTENT not between", value1, value2, "operateContent");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("MODULE is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("MODULE =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("MODULE <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("MODULE >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("MODULE <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("MODULE <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("MODULE like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("MODULE not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("MODULE in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("MODULE not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("MODULE between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("MODULE not between", value1, value2, "module");
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