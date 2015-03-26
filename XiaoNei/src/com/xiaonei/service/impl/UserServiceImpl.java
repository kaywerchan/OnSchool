package com.xiaonei.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.xiaonei.dao.UserDao;
import com.xiaonei.entity.User;
import com.xiaonei.service.UserService;
import com.xiaonei.util.Constants;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public void createUser(String userName, String password, String email, long phone,String school,String major) throws Exception{
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setPhone(phone);
		user.setRegisterDate(new Date());
		user.setEmail(email);
		user.setSchool(school);
		user.setMajor(major);
		userDao.createUser(user);
	}

	@Override
	public void updateUser(String userName, String password, String email, long phone,String school,String major) throws Exception{
		User user = userDao.getUser(userName, password);
		if(user!=null){
			user.setUserName(userName);
			user.setPassword(password);
			user.setPhone(phone);
			user.setRegisterDate(new Date());
			user.setEmail(email);
			userDao.updateUser(user);
		}else{
			throw new RuntimeException();
		}
	}

	@Override
	public User getUser(String userName, String password) throws Exception{
		return userDao.getUser(userName, password);
	}

	@Override
	public boolean isUserExist(String userName) throws Exception {
		return userDao.isUserExist(userName);
	}

	@Override
	public Map<String, Object> mapUser(User user) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("userId", user.getUserId());
		result.put("userName", user.getUserName());
		result.put("email", user.getEmail());
		result.put("phone", user.getPhone());
		result.put("school", user.getSchool());
		result.put("major", user.getMajor());
		result.put("authority", user.getAuthority());
		result.put("cent", user.getCent());
		result.put("population", user.getPopulation());
		result.put("registerdate", user.getRegisterDate());
		return result;
	}

	@Override
	public Map<String, Object> simpleMapUser(User user) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("userId", user.getUserId());
		result.put("userName", user.getUserName());
		result.put("email", user.getEmail());
		result.put("phone", user.getPhone());
		result.put("school", user.getSchool());
		result.put("major", user.getMajor());
		result.put("population", user.getPopulation());
		return result;
	}
	
	
	@Override
	public List<Map<String, Object>> mapUsers(List<User> users)
			throws Exception {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for(User user : users){
			Map<String,  Object> map = new HashMap<String, Object>();
			map = mapUser(user);
			result.add(map);
		}
		return result;
	}


	@Override
	public List<Map<String, Object>> simpleMapUsers(List<User> users)
			throws Exception {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for(User user : users){
			Map<String,  Object> map = new HashMap<String, Object>();
			map = simpleMapUser(user);
			result.add(map);
		}
		return result;
	}

	@Override
	public Map<String, Object> getUserByUserId(long userId) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		User user = userDao.getUserByUserId(userId);
		result = simpleMapUser(user);
		return result;
	}

}
