package com.cn.lxr.controller.base;

import org.apache.log4j.Logger;

public class BaseAction {

	public void excecute() {
		//To test code
	}
	
	/**
	 * 
	* 得到Logger
	* @return Logger
	 */
	public static <T> Logger getLogger(Class<T> c){
		return Logger.getLogger(c.getClass().getName());
	}
}
