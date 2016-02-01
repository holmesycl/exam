package com.asiainfo.exam.domain;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andDicIdIsNull() {
            addCriterion("dic_id is null");
            return (Criteria) this;
        }

        public Criteria andDicIdIsNotNull() {
            addCriterion("dic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDicIdEqualTo(Integer value) {
            addCriterion("dic_id =", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotEqualTo(Integer value) {
            addCriterion("dic_id <>", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdGreaterThan(Integer value) {
            addCriterion("dic_id >", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dic_id >=", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdLessThan(Integer value) {
            addCriterion("dic_id <", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdLessThanOrEqualTo(Integer value) {
            addCriterion("dic_id <=", value, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdIn(List<Integer> values) {
            addCriterion("dic_id in", values, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotIn(List<Integer> values) {
            addCriterion("dic_id not in", values, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdBetween(Integer value1, Integer value2) {
            addCriterion("dic_id between", value1, value2, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dic_id not between", value1, value2, "dicId");
            return (Criteria) this;
        }

        public Criteria andDicCodeIsNull() {
            addCriterion("dic_code is null");
            return (Criteria) this;
        }

        public Criteria andDicCodeIsNotNull() {
            addCriterion("dic_code is not null");
            return (Criteria) this;
        }

        public Criteria andDicCodeEqualTo(String value) {
            addCriterion("dic_code =", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotEqualTo(String value) {
            addCriterion("dic_code <>", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeGreaterThan(String value) {
            addCriterion("dic_code >", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dic_code >=", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeLessThan(String value) {
            addCriterion("dic_code <", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeLessThanOrEqualTo(String value) {
            addCriterion("dic_code <=", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeLike(String value) {
            addCriterion("dic_code like", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotLike(String value) {
            addCriterion("dic_code not like", value, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeIn(List<String> values) {
            addCriterion("dic_code in", values, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotIn(List<String> values) {
            addCriterion("dic_code not in", values, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeBetween(String value1, String value2) {
            addCriterion("dic_code between", value1, value2, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicCodeNotBetween(String value1, String value2) {
            addCriterion("dic_code not between", value1, value2, "dicCode");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNull() {
            addCriterion("dic_value is null");
            return (Criteria) this;
        }

        public Criteria andDicValueIsNotNull() {
            addCriterion("dic_value is not null");
            return (Criteria) this;
        }

        public Criteria andDicValueEqualTo(String value) {
            addCriterion("dic_value =", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotEqualTo(String value) {
            addCriterion("dic_value <>", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThan(String value) {
            addCriterion("dic_value >", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueGreaterThanOrEqualTo(String value) {
            addCriterion("dic_value >=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThan(String value) {
            addCriterion("dic_value <", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLessThanOrEqualTo(String value) {
            addCriterion("dic_value <=", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueLike(String value) {
            addCriterion("dic_value like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotLike(String value) {
            addCriterion("dic_value not like", value, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueIn(List<String> values) {
            addCriterion("dic_value in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotIn(List<String> values) {
            addCriterion("dic_value not in", values, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueBetween(String value1, String value2) {
            addCriterion("dic_value between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicValueNotBetween(String value1, String value2) {
            addCriterion("dic_value not between", value1, value2, "dicValue");
            return (Criteria) this;
        }

        public Criteria andDicTextIsNull() {
            addCriterion("dic_text is null");
            return (Criteria) this;
        }

        public Criteria andDicTextIsNotNull() {
            addCriterion("dic_text is not null");
            return (Criteria) this;
        }

        public Criteria andDicTextEqualTo(String value) {
            addCriterion("dic_text =", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextNotEqualTo(String value) {
            addCriterion("dic_text <>", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextGreaterThan(String value) {
            addCriterion("dic_text >", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextGreaterThanOrEqualTo(String value) {
            addCriterion("dic_text >=", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextLessThan(String value) {
            addCriterion("dic_text <", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextLessThanOrEqualTo(String value) {
            addCriterion("dic_text <=", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextLike(String value) {
            addCriterion("dic_text like", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextNotLike(String value) {
            addCriterion("dic_text not like", value, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextIn(List<String> values) {
            addCriterion("dic_text in", values, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextNotIn(List<String> values) {
            addCriterion("dic_text not in", values, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextBetween(String value1, String value2) {
            addCriterion("dic_text between", value1, value2, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicTextNotBetween(String value1, String value2) {
            addCriterion("dic_text not between", value1, value2, "dicText");
            return (Criteria) this;
        }

        public Criteria andDicDescIsNull() {
            addCriterion("dic_desc is null");
            return (Criteria) this;
        }

        public Criteria andDicDescIsNotNull() {
            addCriterion("dic_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDicDescEqualTo(String value) {
            addCriterion("dic_desc =", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescNotEqualTo(String value) {
            addCriterion("dic_desc <>", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescGreaterThan(String value) {
            addCriterion("dic_desc >", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescGreaterThanOrEqualTo(String value) {
            addCriterion("dic_desc >=", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescLessThan(String value) {
            addCriterion("dic_desc <", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescLessThanOrEqualTo(String value) {
            addCriterion("dic_desc <=", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescLike(String value) {
            addCriterion("dic_desc like", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescNotLike(String value) {
            addCriterion("dic_desc not like", value, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescIn(List<String> values) {
            addCriterion("dic_desc in", values, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescNotIn(List<String> values) {
            addCriterion("dic_desc not in", values, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescBetween(String value1, String value2) {
            addCriterion("dic_desc between", value1, value2, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andDicDescNotBetween(String value1, String value2) {
            addCriterion("dic_desc not between", value1, value2, "dicDesc");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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