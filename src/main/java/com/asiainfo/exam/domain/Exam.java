package com.asiainfo.exam.domain;

import java.util.Date;

public class Exam {
    private Integer examId;

    private String examName;

    private String examAddr;

    private Date answerTime;

    private Integer durationTime;

    private Date createTime;

    private Integer aheadTime;

    private String enterCode;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public String getExamAddr() {
        return examAddr;
    }

    public void setExamAddr(String examAddr) {
        this.examAddr = examAddr == null ? null : examAddr.trim();
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAheadTime() {
        return aheadTime;
    }

    public void setAheadTime(Integer aheadTime) {
        this.aheadTime = aheadTime;
    }

    public String getEnterCode() {
        return enterCode;
    }

    public void setEnterCode(String enterCode) {
        this.enterCode = enterCode == null ? null : enterCode.trim();
    }
}