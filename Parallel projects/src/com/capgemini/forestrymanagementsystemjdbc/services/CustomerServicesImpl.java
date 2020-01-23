package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class CustomerServicesImpl implements CustomerServices{
	CustomerDao dao=Factory.customerDao();
	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customerId);
	}


	@Override
	public List<CustomerBean> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	@Override
	public boolean modify(int cutomer_id, String name) {
		// TODO Auto-generated method stub
		return dao.modify(cutomer_id, name);
	}

	@Override
	public boolean modifyAdd1(int cutomer_id, String Address1) {
		// TODO Auto-generated method stub
		return dao.modifyAdd1(cutomer_id, Address1);
	}

	@Override
	public boolean modifyAddr2(int cutomer_id, String address2) {
		// TODO Auto-generated method stub
		return dao.modifyAddr2(cutomer_id, address2);
	}

	@Override
	public boolean modifyTown(int cutomer_id, String town) {
		// TODO Auto-generated method stub
		return dao.modifyTown(cutomer_id, town);
	}

	@Override
	public boolean modifyCode(int cutomer_id, int postal_code) {
		// TODO Auto-generated method stub
		return dao.modifyCode(cutomer_id, postal_code);
	}

	@Override
	public boolean modifyEmail(int cutomer_id, String email) {
		// TODO Auto-generated method stub
		return dao.modifyEmail(cutomer_id, email);
	}

	@Override
	public boolean modifyTelphone(int cutomer_id, int telphone_no) {
		// TODO Auto-generated method stub
		return dao.modifyTelphone(cutomer_id, telphone_no);
	}

	@Override
	public CustomerBean search(int customer_id) {
		// TODO Auto-generated method stub
		return dao.search(customer_id);
	}

}
