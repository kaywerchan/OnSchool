package com.xiaonei.dao;

import com.xiaonei.entity.User;

public interface UserDao {
	public void createUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;

	public User getUser(String userName, String password) throws Exception;
	
	public boolean isUserExist(String userName)throws Exception;
	
	public User getUserByUserId(long userId) throws Exception;

}
