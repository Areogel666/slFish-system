package com.cn.lxr.entity.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private int id;
	private String code;
	private String password;
	private String pwd_src;
	private String name;
	private String phone;
	private int gender;
	private int type;
	private int status;
	@DateTimeFormat(pattern="yyyy-MM-dd hh24:mm:ss")
    private Date createDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPwd_src() {
		return pwd_src;
	}
	public void setPwd_src(String pwd_src) {
		this.pwd_src = pwd_src;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
}
