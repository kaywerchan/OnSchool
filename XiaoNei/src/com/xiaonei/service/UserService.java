package com.xiaonei.service;

import java.util.List;
import java.util.Map;

import com.xiaonei.entity.User;

public interface UserService {
	public void createUser(String userName, String password, String email, long phone,String school,String major) throws Exception;
	
	public void updateUser(String userName, String password, String email, long phone,String school,String major) throws Exception;
	
	public User getUser(String userName, String password) throws Exception;
	
	public boolean isUserExist(String userName)throws Exception;

	public Map<String, Object> mapUser(User user) throws Exception;
	
	public Map<String, Object> simpleMapUser(User user) throws Exception;
	
	public List<Map<String, Object>> mapUsers(List<User> users) throws Exception;
	
	public List<Map<String, Object>> simpleMapUsers(List<User> users) throws Exception;
	
	public Map<String, Object> getUserByUserId(long userId) throws Exception;
}
