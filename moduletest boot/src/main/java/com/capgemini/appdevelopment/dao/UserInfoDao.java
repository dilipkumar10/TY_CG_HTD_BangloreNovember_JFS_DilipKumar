package com.capgemini.appdevelopment.dao;

import com.capgemini.appdevelopment.dto.UserInfo;

public interface UserInfoDao {
	public UserInfo login(String email, String password);

	public boolean register(UserInfo bean);
	
	public boolean update(String email,String password);
}
