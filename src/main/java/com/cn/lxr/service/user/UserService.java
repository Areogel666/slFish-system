package com.cn.lxr.service.user;


import java.util.List;

import com.cn.lxr.entity.user.User;

public interface UserService {

	/**
	 * 根据条件查询User
	 * @param cultivate 
	 */
	public List<User> showList(User user);

}