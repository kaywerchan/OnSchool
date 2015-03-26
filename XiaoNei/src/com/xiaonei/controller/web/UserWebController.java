package com.xiaonei.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserWebController {
	@RequestMapping("/goToRegisterPage")
	public String goToRegisterPage(){
		System.out.println("进入goToRegisterPage");
		return "registerUser";
	}
}
