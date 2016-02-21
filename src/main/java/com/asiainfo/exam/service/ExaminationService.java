package com.asiainfo.exam.service;

import com.asiainfo.exam.domain.Examination;

public interface ExaminationService {

	/**
	 * 添加一场考试
	 * 
	 * @param examination
	 *            原始数据
	 * @return 持久化后的数据
	 */
	Examination addExamination(Examination examination);

	/**
	 * 根据考试ID获取考试信息
	 * 
	 * @param examId
	 *            考试ID
	 * @return
	 */
	Examination getExaminationById(Integer examId);

}
