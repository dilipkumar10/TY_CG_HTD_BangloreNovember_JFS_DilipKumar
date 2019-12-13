package com.capgemini.phonesimulatorapplicationdevelopment.factory;

import com.capgemini.phonesimulatorapplicationdevelopment.Dao.ContactDao;
import com.capgemini.phonesimulatorapplicationdevelopment.Dao.ContactDaoImpl;
import com.capgemini.phonesimulatorapplicationdevelopment.bean.ContactBean;
import com.capgemini.phonesimulatorapplicationdevelopment.services.ContactServices;
import com.capgemini.phonesimulatorapplicationdevelopment.services.ContactServicesImpl;

public class Factory {
	public static ContactServices contactServiceObject() {
		return new ContactServicesImpl();
	}

	public static ContactDao contactDaoObject() {
		return new ContactDaoImpl();
	}
	public static ContactBean beanObject() {
		return new ContactBean();
	}
}
