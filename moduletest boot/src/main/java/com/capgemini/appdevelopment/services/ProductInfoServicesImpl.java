package com.capgemini.appdevelopment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.appdevelopment.dao.ProductInfoDao;
import com.capgemini.appdevelopment.dto.ProductInfo;
@Service
public class ProductInfoServicesImpl implements ProductInfoServices{
@Autowired
private ProductInfoDao dao;
	@Override
	public boolean addProduct(ProductInfo info) {
		// TODO Auto-generated method stub
		return dao.addProduct(info);
	}

	@Override
	public ProductInfo getProduct(int id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}

}
