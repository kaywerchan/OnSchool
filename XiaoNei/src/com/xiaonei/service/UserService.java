package com.xiaonei.service;

import com.xiaonei.entity.User;

public interface UserService {
	public void createUser(String userName, String password, String email, long phone,String school,String major) throws Exception;
	
	public void updateUser(String userName, String password, String email, long phone,String school,String major) throws Exception;
	
	public User getUser(String userName, String password) throws Exception;
	
	public boolean isUserExist(String userName)throws Exception;


}
