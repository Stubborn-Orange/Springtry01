package com.ffk.dao;

import com.ffk.entity.User;

/**
 * 
* @ClassName: UserDao 
* @Description: TODO(������һ�仰��������������) 
* @author A18ccms a18ccms_gmail_com 
* @date 2015��5��18�� ����8:25:11 
*
 */
public interface UserDao {
	
	public User findByName(String name);
}
