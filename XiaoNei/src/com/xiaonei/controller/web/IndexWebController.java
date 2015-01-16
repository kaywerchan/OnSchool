package com.xiaonei.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexWebController {
	@RequestMapping("goToPersonalInfoPage")
	public String goToPersonalInfoPage(){
		return "personalInfo";
	}

}
