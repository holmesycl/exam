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
	 * 跳转至创建考试界面
	 * 
	 * @return
	 */
	@RequestMapping("/createExamination.html")
	public String forwardCreateExamitionPage() {
		return "createExamination";
	}

	/**
	 * 创建考试
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
	 * 查看考试信息
	 * 
	 * @param examId
	 *            考试ID
	 * @return
	 */
	@RequestMapping("/{examId}")
	public String viewExamination(@PathVariable Integer examId, Model model) {
		logger.debug(">>考试ID：{}", examId);
		Examination examination = examinationService.getExaminationById(examId);
		model.addAttribute("exam", examination);
		return "examination";
	}
}
