package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractorBean;

public interface ContractorDao {
public boolean addContractor(ContractorBean bean);
public boolean deleteContractorBean(int contractNo);
public List<ContractorBean> getAllContractors();
}
