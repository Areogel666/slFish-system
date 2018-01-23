package com.cn.lxr.controller.user;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.lxr.controller.base.BaseAction;
import com.cn.lxr.service.user.UserService;


@Controller
@RequestMapping("/user")
public class UserAction extends BaseAction{

	private Logger logger = getLogger(this.getClass());
	
	@Resource(name="userService")
	private UserService userService;
	
	
	@Override
	public void excecute(){
		logger.debug("这里是测试方法！！！");
	}
	
	//查看用户
	@RequestMapping(value="/list")
	public String login(){
//		return "/content/user/userList.jsp";
		return "user/userList";
	}
	
	@RequestMapping(value="/list1.action")
	public String login1(){
		return "/content/user/userList.jsp";
	}
	@RequestMapping("/list2")
	public String login2(){
		return "/content/user/userList.jsp";
	}
}
