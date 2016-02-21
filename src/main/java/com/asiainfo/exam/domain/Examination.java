package com.asiainfo.exam.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Examination implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6941900531911522288L;

	private Integer examId;

	private String examName;

	private String examAddr;

	private Date answerTime;

	private String formatAnswer;

	private Integer durationTime;

	private Date createTime;

	private Integer aheadTime;

	private String enterCode;

	private Integer creator;

	private Integer examType;

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
		// 设置格式化的时间
		setFormatAnswer(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(answerTime));
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

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Integer getExamType() {
		return examType;
	}

	public void setExamType(Integer examType) {
		this.examType = examType;
	}

	public String getFormatAnswer() {
		return formatAnswer;
	}

	public void setFormatAnswer(String formatAnswer) {
		this.formatAnswer = formatAnswer;
	}

	/**
	 * 随机生成进入考试编号
	 * 
	 * @return
	 */
	public static String generalExamCode() {
		return UUID.randomUUID().toString().substring(0, 6);
	}

	@Override
	public String toString() {
		return "Examination [examId=" + examId + ", examName=" + examName + ", examAddr=" + examAddr + ", answerTime=" + answerTime
				+ ", formatAnswer=" + formatAnswer + ", durationTime=" + durationTime + ", createTime=" + createTime + ", aheadTime="
				+ aheadTime + ", enterCode=" + enterCode + ", creator=" + creator + ", examType=" + examType + "]";
	}

}