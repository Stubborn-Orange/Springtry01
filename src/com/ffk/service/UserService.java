package com.ffk.service;

import com.ffk.dao.UserDao;
import com.ffk.entity.User;

public class UserService {
	private UserDao userDao;

	/** 
	 * @return userDao 
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * ��½ϵͳ����
	 */
	public User login(String name,String pwd){
		try {
			User user = userDao.findByName(name);
			if (user.getPwd().equals(pwd)) {
				return user;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
