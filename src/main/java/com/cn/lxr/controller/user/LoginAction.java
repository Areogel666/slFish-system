package com.cn.lxr.controller.user;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.lxr.controller.base.BaseAction;
import com.cn.lxr.entity.user.User;
import com.cn.lxr.service.user.UserService;


@Controller
public class LoginAction extends BaseAction{

	private Logger logger = getLogger(this.getClass());
	
	@Resource(name="userService")
	private UserService userService;
	
	
	@Override
	public void excecute(){
		logger.debug("这里是测试方法！！！");
	}
	
	//登录系统
	@RequestMapping(value="/login.action")
	public String login(){
		List<User> list = userService.showList(null);
		System.out.println(list);
		logger.debug(list);
		return "/login.jsp";
	}
	
}
