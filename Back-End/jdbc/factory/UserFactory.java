package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDao;
import com.capgemini.jdbc.dao.UserDaoimpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesimpl;

public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDao instanceOfUserDaoimpl() {
		UserDao dao= new UserDaoimpl();
		return dao;
	}
	public static UserServices instanceOfUserServices() {
		UserServices services=new UserServicesimpl();
		return services;
	}
}
