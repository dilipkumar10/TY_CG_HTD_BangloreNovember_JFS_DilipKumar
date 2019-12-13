package com.capgemini.phonesimulatorapplicationdevelopment.services;

import java.util.List;

import com.capgemini.phonesimulatorapplicationdevelopment.Dao.ContactDao;
import com.capgemini.phonesimulatorapplicationdevelopment.bean.ContactBean;
import com.capgemini.phonesimulatorapplicationdevelopment.factory.Factory;

public class ContactServicesImpl implements ContactServices {
ContactDao dao=Factory.contactDaoObject();
	@Override
	public boolean add(ContactBean bean) {
		return dao.add(bean);
	}

	@Override
	public boolean delete(String name) {
		return dao.delete(name);
	}

	@Override
	public boolean edit(String name,long number) {
		return dao.edit(name,number);
	}

	@Override
	public List<ContactBean> getAllContacts() {
		return dao.getAllContacts();
	}

	@Override
	public boolean search(String name) {
		// TODO Auto-generated method stub
		return dao.search(name);
	}

}
