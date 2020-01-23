package com.capgemini.forestrymanagementsystemjdbc.services;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;

public interface AdminServices {
	public boolean login(String name, String password);

	public boolean signup(UsersBean bean);

	public boolean delete(String name, String password);

	public boolean update(String name, String password);
}
