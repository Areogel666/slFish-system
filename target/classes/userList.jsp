<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <meta http-equiv=content-type content="text/html; charset=utf-8" />
        <link href="${pageContext.request.contextPath}/css/admin.css" type="text/css" rel="stylesheet" />
        
        <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    	<script type="text/javascript">
    		// 显示时间
    		function disptime(){
    			var time=new Date();
    			document.getElementById("myclock").value=time.getHours()+":"+time.getMinutes()+":"+time.getSeconds()+"";
    			var myTime=setTimeout("disptime()",1000);	
    		}
    		
    	</script>
        
    </head>
    <body onload="disptime();" >
   
    	<form name="myForm">
        <table cellspacing=0 cellpadding=0 width="100%" align=center border=0>
            <tr height=28>
                <td background=${pageContext.request.contextPath}/img/title_bg1.jpg>当前位置: </td></tr>
            <tr>
                <td bgcolor=#b1ceef height=1></td></tr>
            <tr height=20>
                <td background=${pageContext.request.contextPath}/img/shadow_bg.jpg></td></tr></table>
        <table cellspacing=0 cellpadding=0 width="90%" align=center border=0>
            <tr height=100>
                <td align=middle width=100>
					<img height=100 src="${pageContext.request.contextPath}/img/photo/${nowEmployee.empPhoto}"  width=90>
				</td>
                <td width=60>&nbsp;</td>
                <td>
                    <table height=100 cellspacing=0 cellpadding=0 width="100%" border=0>

                        <tr>
                         <td>当前时间：<input style="border: 0;" type="text" name="myclock" id="myclock"/></td>
						</tr>
                        <tr>
                            <td style="font-weight: bold; font-size: 16px"><a href="${pageContext.request.contextPath}/employee_getsex.action">${nowEmployee.username}</a></td>
						</tr>
                        <tr>
                            <td>欢迎进入网站管理中心！</td></tr></table></td>
						</tr>
            <tr>
         <td colspan=3 height=10></td></tr></table>
        <table cellspacing=0 cellpadding=0 width="95%" align=center border=0>
            <tr height=20>
                <td></td></tr>
            <tr height=22>
                <td style="padding-left: 20px; font-weight: bold; color: #ffffff" 
                    align=middle background=./img/title_bg2.jpg>个人信息</td></tr>
            <tr bgcolor=#ecf4fc height=12>
                <td></td></tr>
            <tr height=20>
                <td></td></tr></table>
        <table cellspacing=0 cellpadding=2 width="95%" align=center border=0>
            <tr>
                <td align=right width=100>登陆帐号：</td>
                <td style="color: #880000">${nowEmployee.loginname}</td></tr>
            <tr>
                <td align=right>真实姓名：</td>
                <td style="color: #880000">${nowEmployee.username}</td></tr>
            <tr>
                <td align=right>注册时间：</td>
                <td style="color: #880000"><fmt:formatDate value="${nowEmployee.createdate}" pattern="yyyy-MM-dd" /></td></tr>
            <tr>
                <td align=right>登陆次数：</td>
                <td style="color: #880000">${loginCount}</td></tr>
            <tr>
                <td align=right>上线时间：</td>
                <td style="color: #880000"><fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss" /></td></tr>
            <tr>
                <td align=right>ip 地址：</td>
                <td style="color: #880000">${addr}</td></tr>
            <tr>
                <td align=right>身份过期：</td>
                <td style="color: #880000">30 分钟</td>
			</tr>
        </table>	
       
        	
<div style="text-align:center;">
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<p>维护信息：<a  target="_blank">***</a></p>
<p>联系电话：<a  target="_blank">110</a></p>
</div>
</form>
    </body>
</html>