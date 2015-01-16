package com.xiaonei.service.impl;

import java.util.Date;

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

}
