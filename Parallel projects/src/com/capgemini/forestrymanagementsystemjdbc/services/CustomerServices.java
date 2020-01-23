package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;

public interface CustomerServices {
	public boolean addCustomer(CustomerBean bean);
	public boolean deleteCustomer(int customerId);
	public List<CustomerBean> getAllCustomer();
	public boolean modify(int cutomer_id, String name);

	public boolean modifyAdd1(int cutomer_id, String Address1);

	public boolean modifyAddr2(int cutomer_id, String address2);

	public boolean modifyTown(int cutomer_id, String town);

	public boolean modifyCode(int cutomer_id, int postal_code);

	public boolean modifyEmail(int cutomer_id, String email);

	public boolean modifyTelphone(int cutomer_id, int telphone_no);
	public CustomerBean search(int customer_id);
}
