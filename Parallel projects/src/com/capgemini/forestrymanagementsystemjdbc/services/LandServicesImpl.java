package com.capgemini.forestrymanagementsystemjdbc.services;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.bean.LandBean;
import com.capgemini.forestrymanagementsystemjdbc.dao.LandDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.Factory;

public class LandServicesImpl implements LandServices {
 public static LandDao dao=Factory.landDaomethod();
	@Override
	public boolean add(LandBean land) {
		// TODO Auto-generated method stub
		return dao.add(land) ;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<LandBean> getAllLands() {
		// TODO Auto-generated method stub
		return dao.getAllLands();
	}

	@Override
	public boolean updateName(int id, String name) {
		// TODO Auto-generated method stub
		return dao.updateName(id, name);
	}

	@Override
	public boolean updateSize(int id, int size) {
		// TODO Auto-generated method stub
		return dao.updateSize(id, size);
	}

	@Override
	public boolean updateProduct(int id, String product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(id, product);
	}

}
