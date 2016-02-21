package com.asiainfo.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asiainfo.exam.domain.Examination;
import com.asiainfo.exam.service.ExaminationService;

@Controller
@RequestMapping("/examination")
public class ExaminationController extends BaseController {

	@Autowired
	private ExaminationService examinationService;

	/**
	 * ��ת���������Խ���
	 * 
	 * @return
	 */
	@RequestMapping("/createExamination.html")
	public String forwardCreateExamitionPage() {
		return "createExamination";
	}

	/**
	 * ��������
	 * 
	 * @param examination
	 * @return
	 */
	@RequestMapping(path = "/createExamination", method = RequestMethod.POST)
	public String createExamination(Examination examination) {
		// ...
		logger.debug(examination.toString());
		examination = examinationService.addExamination(examination);
		return "redirect:" + examination.getExamId() + ".html";
	}

	/**
	 * �鿴������Ϣ
	 * 
	 * @param examId
	 *            ����ID
	 * @return
	 */
	@RequestMapping("/{examId}")
	public String viewExamination(@PathVariable Integer examId, Model model) {
		logger.debug(">>����ID��{}", examId);
		Examination examination = examinationService.getExaminationById(examId);
		model.addAttribute("exam", examination);
		return "examination";
	}
}
