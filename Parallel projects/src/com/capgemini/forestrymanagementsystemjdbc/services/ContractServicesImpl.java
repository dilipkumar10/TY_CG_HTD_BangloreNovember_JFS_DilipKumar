package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractorDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class ContractServicesImpl implements ContractorServices {
	ContractorDaoImpl d = Factory.contractorDao();

	@Override
	public boolean addContractor(ContractorBean bean) {
		// TODO Auto-generated method stub
		return d.addContractor(bean);
	}

	@Override
	public boolean deleteContractorBean(int customerId) {
		// TODO Auto-generated method stub
		return d.deleteContractorBean(customerId);
	}

	@Override
	public List<ContractorBean> getAllContractors() {
		// TODO Auto-generated method stub
		return d.getAllContractors();
	}

}
