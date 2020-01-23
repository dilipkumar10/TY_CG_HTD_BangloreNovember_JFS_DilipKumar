package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.SchedulerDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class SchedulerServicesImpl implements SchedulerServices{
SchedulerDao dao=Factory.schedulerDao();
	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return dao.login(name, password);
	}
	@Override
	public boolean signup(UsersBean bean) {
		// TODO Auto-generated method stub
		return dao.signup(bean);
	}
	@Override
	public boolean delete(String name, String password) {
		// TODO Auto-generated method stub
		return dao.delete(name, password);
	}
	@Override
	public boolean update(String name, String password) {
		// TODO Auto-generated method stub
		return dao.update(name, password);
	}

}
