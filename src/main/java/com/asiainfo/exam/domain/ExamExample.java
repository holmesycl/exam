package com.asiainfo.exam.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNull() {
            addCriterion("exam_name is null");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNotNull() {
            addCriterion("exam_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamNameEqualTo(String value) {
            addCriterion("exam_name =", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotEqualTo(String value) {
            addCriterion("exam_name <>", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThan(String value) {
            addCriterion("exam_name >", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_name >=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThan(String value) {
            addCriterion("exam_name <", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThanOrEqualTo(String value) {
            addCriterion("exam_name <=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLike(String value) {
            addCriterion("exam_name like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotLike(String value) {
            addCriterion("exam_name not like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameIn(List<String> values) {
            addCriterion("exam_name in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotIn(List<String> values) {
            addCriterion("exam_name not in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameBetween(String value1, String value2) {
            addCriterion("exam_name between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotBetween(String value1, String value2) {
            addCriterion("exam_name not between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamAddrIsNull() {
            addCriterion("exam_addr is null");
            return (Criteria) this;
        }

        public Criteria andExamAddrIsNotNull() {
            addCriterion("exam_addr is not null");
            return (Criteria) this;
        }

        public Criteria andExamAddrEqualTo(String value) {
            addCriterion("exam_addr =", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrNotEqualTo(String value) {
            addCriterion("exam_addr <>", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrGreaterThan(String value) {
            addCriterion("exam_addr >", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrGreaterThanOrEqualTo(String value) {
            addCriterion("exam_addr >=", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrLessThan(String value) {
            addCriterion("exam_addr <", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrLessThanOrEqualTo(String value) {
            addCriterion("exam_addr <=", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrLike(String value) {
            addCriterion("exam_addr like", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrNotLike(String value) {
            addCriterion("exam_addr not like", value, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrIn(List<String> values) {
            addCriterion("exam_addr in", values, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrNotIn(List<String> values) {
            addCriterion("exam_addr not in", values, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrBetween(String value1, String value2) {
            addCriterion("exam_addr between", value1, value2, "examAddr");
            return (Criteria) this;
        }

        public Criteria andExamAddrNotBetween(String value1, String value2) {
            addCriterion("exam_addr not between", value1, value2, "examAddr");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNull() {
            addCriterion("answer_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNotNull() {
            addCriterion("answer_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeEqualTo(Date value) {
            addCriterion("answer_time =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotEqualTo(Date value) {
            addCriterion("answer_time <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThan(Date value) {
            addCriterion("answer_time >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_time >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThan(Date value) {
            addCriterion("answer_time <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_time <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIn(List<Date> values) {
            addCriterion("answer_time in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotIn(List<Date> values) {
            addCriterion("answer_time not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeBetween(Date value1, Date value2) {
            addCriterion("answer_time between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_time not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIsNull() {
            addCriterion("duration_time is null");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIsNotNull() {
            addCriterion("duration_time is not null");
            return (Criteria) this;
        }

        public Criteria andDurationTimeEqualTo(Integer value) {
            addCriterion("duration_time =", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotEqualTo(Integer value) {
            addCriterion("duration_time <>", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeGreaterThan(Integer value) {
            addCriterion("duration_time >", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration_time >=", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeLessThan(Integer value) {
            addCriterion("duration_time <", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeLessThanOrEqualTo(Integer value) {
            addCriterion("duration_time <=", value, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeIn(List<Integer> values) {
            addCriterion("duration_time in", values, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotIn(List<Integer> values) {
            addCriterion("duration_time not in", values, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeBetween(Integer value1, Integer value2) {
            addCriterion("duration_time between", value1, value2, "durationTime");
            return (Criteria) this;
        }

        public Criteria andDurationTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("duration_time not between", value1, value2, "durationTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeIsNull() {
            addCriterion("ahead_time is null");
            return (Criteria) this;
        }

        public Criteria andAheadTimeIsNotNull() {
            addCriterion("ahead_time is not null");
            return (Criteria) this;
        }

        public Criteria andAheadTimeEqualTo(Integer value) {
            addCriterion("ahead_time =", value, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeNotEqualTo(Integer value) {
            addCriterion("ahead_time <>", value, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeGreaterThan(Integer value) {
            addCriterion("ahead_time >", value, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ahead_time >=", value, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeLessThan(Integer value) {
            addCriterion("ahead_time <", value, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ahead_time <=", value, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeIn(List<Integer> values) {
            addCriterion("ahead_time in", values, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeNotIn(List<Integer> values) {
            addCriterion("ahead_time not in", values, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeBetween(Integer value1, Integer value2) {
            addCriterion("ahead_time between", value1, value2, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andAheadTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ahead_time not between", value1, value2, "aheadTime");
            return (Criteria) this;
        }

        public Criteria andEnterCodeIsNull() {
            addCriterion("enter_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterCodeIsNotNull() {
            addCriterion("enter_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterCodeEqualTo(String value) {
            addCriterion("enter_code =", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeNotEqualTo(String value) {
            addCriterion("enter_code <>", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeGreaterThan(String value) {
            addCriterion("enter_code >", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enter_code >=", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeLessThan(String value) {
            addCriterion("enter_code <", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeLessThanOrEqualTo(String value) {
            addCriterion("enter_code <=", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeLike(String value) {
            addCriterion("enter_code like", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeNotLike(String value) {
            addCriterion("enter_code not like", value, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeIn(List<String> values) {
            addCriterion("enter_code in", values, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeNotIn(List<String> values) {
            addCriterion("enter_code not in", values, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeBetween(String value1, String value2) {
            addCriterion("enter_code between", value1, value2, "enterCode");
            return (Criteria) this;
        }

        public Criteria andEnterCodeNotBetween(String value1, String value2) {
            addCriterion("enter_code not between", value1, value2, "enterCode");
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