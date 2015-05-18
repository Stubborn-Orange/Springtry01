package com.ffk.dao;

import com.ffk.entity.User;

/**
 * 
* @ClassName: UserDao 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2015年5月18日 下午8:25:11 
*
 */
public interface UserDao {
	
	public User findByName(String name);
}
