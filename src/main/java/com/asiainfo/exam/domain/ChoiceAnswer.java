package com.asiainfo.exam.domain;

public class ChoiceAnswer {
    private Integer choiceAnswerId;

    private Integer paperId;

    private Integer questionId;

    private String answer;

    private String isRight;

    public Integer getChoiceAnswerId() {
        return choiceAnswerId;
    }

    public void setChoiceAnswerId(Integer choiceAnswerId) {
        this.choiceAnswerId = choiceAnswerId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getIsRight() {
        return isRight;
    }

    public void setIsRight(String isRight) {
        this.isRight = isRight == null ? null : isRight.trim();
    }
}