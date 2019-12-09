package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDao;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesimpl implements UserServices {

	UserDao dao=UserFactory.instanceOfUserDaoimpl();
	@Override
	public List<UserBean> getAllUsers() {
		// 
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return dao.userLogin(username, password);
	}

	@Override
	public boolean updateUser(int userid, String username, String email) {
		// TODO Auto-generated method stub
		return dao.updateUser(userid, username, email);
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		// TODO Auto-generated method stub
		return dao.deleteUser(userid, password);
	}

	@Override
	public boolean insertUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	
	}


