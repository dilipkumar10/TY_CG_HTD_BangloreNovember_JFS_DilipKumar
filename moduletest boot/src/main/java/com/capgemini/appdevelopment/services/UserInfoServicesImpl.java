package com.capgemini.appdevelopment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.appdevelopment.dao.UserInfoDao;
import com.capgemini.appdevelopment.dto.UserInfo;
@Service
public class UserInfoServicesImpl implements UserInfoServices{
@Autowired
private UserInfoDao dao;
	@Override
	public UserInfo login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.login(email, password);
	}

	@Override
	public boolean register(UserInfo bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public boolean update(String email, String password) {
		// TODO Auto-generated method stub
		return dao.update(email,password);
	}

}
