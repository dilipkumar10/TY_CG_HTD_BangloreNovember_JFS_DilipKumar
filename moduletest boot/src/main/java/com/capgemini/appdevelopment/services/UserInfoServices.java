package com.capgemini.appdevelopment.services;

import com.capgemini.appdevelopment.dto.UserInfo;

public interface UserInfoServices {
	public UserInfo login(String email, String password);

	public boolean register(UserInfo bean);
	
	public boolean update(String email,String password);
}
