package com.xiaonei.controller;

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
import com.xiaonei.websocket.ChatStatic;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
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
				result.put("msg", "登录成功");
				request.getSession().setAttribute("userName", user.getUserName());
				request.getSession().setAttribute("userId", user.getUserId());
			}else{
				result.put("status", 0);
				result.put("msg", "账号密码不匹配");
			}
		} catch (Exception e) {
			result.put("status", -1);
			result.put("msg", "登录出错");
			e.printStackTrace();
		}
		return result;
		
	}
	
	@RequestMapping("logout")
	public void logout(HttpServletRequest request,HttpServletResponse response,HttpSession session){
		try {
			Long userId = null;
			userId =(Long)session.getAttribute("userId");
			session.removeAttribute("userName");
			session.removeAttribute("userId");
//			ChatStatic.onlineNum--;
			ChatStatic.conns.remove(userId);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
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
				result.put("msg", "注册成功");
				request.setAttribute("userName", userName);
			}else{
				result.put("status", 0);
				result.put("msg", "用户名已存在，请重新填写用户名");
			}
			
		} catch (Exception e) {
			result.put("status", -1);
			result.put("msg", "注册出错");
			e.printStackTrace();
		}
		return result;
	}
	
	
	@RequestMapping(value = "/getUserByUserId")
	@ResponseBody
	public Map<String, Object> getUserByUserId(HttpServletRequest request){
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			long userId = Long.parseLong(request.getParameter("userId"));
			result = userService.getUserByUserId(userId);
			result.put("status", 1);
		} catch (Exception e) {
			result.put("status", -1);
			result.put("msg", "获取用户出错");
			e.printStackTrace();
		}
		return result;
	}
	
	

}
