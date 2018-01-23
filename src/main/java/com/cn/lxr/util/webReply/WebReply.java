package com.cn.lxr.util.webReply;

import javax.servlet.http.HttpServletResponse;

public abstract class WebReply {

	public abstract void write(HttpServletResponse response, Object o) throws Exception;
}
