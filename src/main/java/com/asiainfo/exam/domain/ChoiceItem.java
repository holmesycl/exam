package com.asiainfo.exam.domain;

public class ChoiceItem {
    private Integer itemId;

    private Integer questionId;

    private String sign;

    private String itemContent;

    private String itemAnalysis;

    private Integer isAnswer;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent == null ? null : itemContent.trim();
    }

    public String getItemAnalysis() {
        return itemAnalysis;
    }

    public void setItemAnalysis(String itemAnalysis) {
        this.itemAnalysis = itemAnalysis == null ? null : itemAnalysis.trim();
    }

    public Integer getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Integer isAnswer) {
        this.isAnswer = isAnswer;
    }
}