package com.asiainfo.exam.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.exam.domain.Examination;
import com.asiainfo.exam.persistence.ExaminationMapper;
import com.asiainfo.exam.service.ExaminationService;

@Service("examinationService")
public class ExaminationServiceImpl implements ExaminationService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ExaminationMapper examinationMapper;

	@Override
	public Examination addExamination(Examination examination) {
		checkNotNull(examination);
		// ���ô���ʱ��
		examination.setCreateTime(new Date());
		// ���ý��뿼����
		examination.setEnterCode(Examination.generalExamCode());
		// ���ô�����
		// ..
		examinationMapper.insert(examination);
		logger.debug(examination.toString());
		return examination;
	}

	@Override
	public Examination getExaminationById(Integer examId) {
		checkNotNull(examId);
		Examination examination = examinationMapper.selectByPrimaryKey(examId);
		logger.debug(examination.toString());
		return examination;
	}

}
