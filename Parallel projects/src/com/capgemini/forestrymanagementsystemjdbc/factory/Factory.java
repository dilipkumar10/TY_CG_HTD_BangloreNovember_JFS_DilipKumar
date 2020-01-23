package com.capgemini.forestrymanagementsystemjdbc.factory;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.bean.LandBean;
import com.capgemini.forestrymanagementsystemjdbc.controller.Contractor;
import com.capgemini.forestrymanagementsystemjdbc.dao.AdminDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.AdminDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.ClientDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.ClientDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractorDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractorDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.LandDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.LandDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.SchedulerDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.SchedulerDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.AdminServices;
import com.capgemini.forestrymanagementsystemjdbc.services.AdminServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.ClientServices;
import com.capgemini.forestrymanagementsystemjdbc.services.ClientServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.LandServices;
import com.capgemini.forestrymanagementsystemjdbc.services.LandServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServicesImpl;
import com.capgemini.forestrymanagementsystemjdbc.services.SchedulerServices;
import com.capgemini.forestrymanagementsystemjdbc.services.SchedulerServicesImpl;

public class Factory {
	private Factory() {
		
	}
	public static ProductDaoImpl ProductDao() {
		return new ProductDaoImpl();
	}

	public static ProductServicesImpl productServices() {
		return new ProductServicesImpl();
	}

	public static ContractServicesImpl contractorServices() {
		return new ContractServicesImpl();
	}

	public static ContractorDaoImpl contractorDao() {
		return new ContractorDaoImpl();
	}

	public static CustomerServicesImpl customerServices() {
		return new CustomerServicesImpl();
	}

	public static CustomerDaoImpl customerDao() {
		return new CustomerDaoImpl();
	}

	public static CustomerBean getCustBean() {
		return new CustomerBean();
	}

	public static AdminServices adminServiceMethod() {
		return new AdminServicesImpl();
	}

	public static AdminDao FactoryDaoMethod() {
		return new AdminDaoImpl();
	}
	public static ClientDao clientDao() {
		return new ClientDaoImpl();
	}
	public static ClientServices clientServices() {
		return new ClientServicesImpl();
	}
	public static SchedulerDao schedulerDao() {
		return new SchedulerDaoImpl();
	}
	public static SchedulerServices schedulerServices() {
		return new SchedulerServicesImpl();
	}
	public static LandBean landMethod() {
		return new LandBean();
	}
	
	public static LandServices landServices() {
		return new LandServicesImpl();
	}
	
	public static LandDao landDaomethod() {
		return new LandDaoImpl();
	}
	
	
}
