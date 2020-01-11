package com.capgemini.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.appdevelopment.dto.ProductInfo;
@Repository
public class ProductInfoDaoImpl implements ProductInfoDao{
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	@Override
	public boolean addProduct(ProductInfo info) {
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(info);
		transaction.commit();
		manager.close();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	
	}

	@Override
	public ProductInfo getProduct(int id) {
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
			ProductInfo productBean=manager.find(ProductInfo.class, id);
			if(productBean!=null) {
				transaction.begin();
				return productBean;
			}
			else {
				return null;
			}
	
	}

}
