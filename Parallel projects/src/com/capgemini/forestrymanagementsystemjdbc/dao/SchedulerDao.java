package com.capgemini.forestrymanagementsystemjdbc.dao;

import com.capgemini.forestrymanagementsystemjdbc.bean.UsersBean;

public interface SchedulerDao {
	public boolean login(String name, String password);

	public boolean signup(UsersBean bean);

	public boolean delete(String name, String password);

	public boolean update(String name, String password);
}
