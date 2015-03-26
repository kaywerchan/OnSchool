package com.xiaonei.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.xiaonei.dao.UserDao;
import com.xiaonei.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void createUser(User user) throws Exception{
		hibernateTemplate.save(user);
	}
	
	@Override
	public void updateUser(User user) throws Exception {
		hibernateTemplate.update(user);
	}
	
	@Override
	public User getUser(String userName, String password) throws Exception{
		User user = null;
		String hql = "From User u Where u.userName=? And password=?";
		List<User> listResult = new ArrayList<User>();
		listResult = (List<User>) hibernateTemplate.find(hql, new String[]{userName,password});
		if(listResult.size()>0){
			user = (User) listResult.get(0);
		}
		return user;
	}

	@Override
	public boolean isUserExist(String userName) throws Exception {
		String hql = "From User u Where u.userName=?";
		List<User> listResult = (List<User>) hibernateTemplate.find(hql, userName);
		if(listResult.size()==0){
			return false;
		}
		return true;
	}

	@Override
	public User getUserByUserId(long userId) throws Exception {
		User user = hibernateTemplate.get(User.class, userId);
		return user;
	}

}
