package com.xiaonei.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaonei.entity.User;
import com.xiaonei.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(HttpServletRequest request){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			User user = null;
			user = userService.getUser(userName, password);
			if(user!=null){
				result.put("status", 1);
				result.put("msg", "µÇÂ¼³É¹¦£¡");
				request.getSession().setAttribute("userName", user.getUserName());
			}else{
				result.put("status", 0);
				result.put("msg", "ÕËºÅÃÜÂë²»Æ¥Åä");
			}
		} catch (Exception e) {
			result.put("status", -1);
			result.put("msg", "µÇÂ¼Òì³££¬ÇëÖØÐÂµÇÂ¼£¡");
			e.printStackTrace();
		}
		return result;
		
	}
	
	@RequestMapping("logout")
	public void logout(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		try {
			session.removeAttribute("userName");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public Map<String, Object> registerUser(HttpServletRequest request){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String school = request.getParameter("school");
			String major = request.getParameter("major");
			boolean isUserExist = userService.isUserExist(userName);
			if(!isUserExist){
				userService.createUser(userName, password, email, Long.parseLong(phone),school,major);
				result.put("status", 1);
				result.put("msg", "×¢²á³É¹¦£¡");
				request.setAttribute("userName", userName);
			}else{
				result.put("status", 0);
				result.put("msg", "ÓÃ»§ÃûÒÑ×¢²á£¡");
			}
			
		} catch (Exception e) {
			result.put("status", -1);
			result.put("msg", "×¢²áÊ§°Ü£¬ÇëÉÔºóÔÙ×¢²á£¡");
			e.printStackTrace();
		}
		return result;
	}

}
