package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.AdminDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class AdminServicesImpl implements AdminServices{
AdminDao d=Factory.FactoryDaoMethod();
	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return d.login(name, password);
	}
	@Override
	public boolean signup(UsersBean bean) {
		// TODO Auto-generated method stub
		return d.signup(bean);
	}
	@Override
	public boolean delete(String name, String password) {
		// TODO Auto-generated method stub
		return d.delete(name, password);
	}
	@Override
	public boolean update(String name, String password) {
		// TODO Auto-generated method stub
		return d.update(name, password);
	}

}
