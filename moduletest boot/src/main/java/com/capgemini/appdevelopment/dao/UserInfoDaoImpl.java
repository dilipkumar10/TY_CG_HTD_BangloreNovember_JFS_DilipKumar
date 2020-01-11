package com.capgemini.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.appdevelopment.dto.UserInfo;
import com.capgemini.appdevelopment.exception.UsersInfoException;
@Repository
public class UserInfoDaoImpl implements UserInfoDao{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserInfo login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo info=manager.find(UserInfo.class, email);
		if(info!=null) {
			return info;
		}else {
			return null;
		}
		
	}

	@Override
	public boolean register(UserInfo bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			manager.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo info=manager.find(UserInfo.class, email);
		if(info!=null) {
			info.setPassword(password);
			return true;
		}else {
		return false;
		}
	}

}
