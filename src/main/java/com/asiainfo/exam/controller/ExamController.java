package com.asiainfo.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/create")
public class ExamController {

	/* /WEB-INF/views/exam.jsp */
	private final static String HOME_PAGE = "exam";

	/**
	 * Ω¯»Îøº ‘≈‰÷√“≥√Ê
	 * 
	 * @return
	 */
	@RequestMapping({"", "/home.html"})
	public String home() {
		return HOME_PAGE;
	}
}
