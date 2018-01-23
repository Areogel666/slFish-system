package com.cn.lxr.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.lxr.dao.user.UserDao;
import com.cn.lxr.entity.user.User;
import com.cn.lxr.service.user.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public List<User> showList(User user) {
		return userDao.getAllUsers(user);
	}


}
