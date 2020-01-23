package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;

public interface ClientServices {
	public boolean addClient(UsersBean bean);

	public boolean login(String name, String password);

	public boolean delete(String name, String password);

	public boolean update(String name, String password);
}
