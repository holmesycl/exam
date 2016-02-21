package com.asiainfo.exam.service;

import com.asiainfo.exam.domain.Examination;

public interface ExaminationService {

	/**
	 * ���һ������
	 * 
	 * @param examination
	 *            ԭʼ����
	 * @return �־û��������
	 */
	Examination addExamination(Examination examination);

	/**
	 * ���ݿ���ID��ȡ������Ϣ
	 * 
	 * @param examId
	 *            ����ID
	 * @return
	 */
	Examination getExaminationById(Integer examId);

}
