package com.cn.lxr.dao.user;

import java.util.List;

import com.cn.lxr.entity.user.User;


public interface UserDao {

	/**
	 * 
	* 根据条件全查询
	* @return List<User>
	 */
	public List<User> getAllUsers(User user);
}
