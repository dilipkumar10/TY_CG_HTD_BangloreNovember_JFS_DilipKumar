package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.ClientDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class ClientServicesImpl implements ClientServices {
ClientDao dao=Factory.clientDao();
	@Override
	public boolean addClient(UsersBean bean) {
		return dao.addClient(bean);
	}

	@Override
	public boolean login(String name, String password) {
		return dao.login(name, password);
	}

	@Override
	public boolean delete(String name, String password) {
		return dao.delete(name, password);
	}

	@Override
	public boolean update(String name, String password) {
		return dao.update(name, password);
	}

}
