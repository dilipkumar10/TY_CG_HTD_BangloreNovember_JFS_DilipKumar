package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;

public interface ContractorServices {
	public boolean addContractor(ContractorBean bean);
	public boolean deleteContractorBean(int customerId);
	public List<ContractorBean> getAllContractors();
}
