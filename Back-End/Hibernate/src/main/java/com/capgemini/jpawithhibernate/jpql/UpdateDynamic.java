package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	String jpql="update Movie set mname=:nm where mid=:id";
	Query query=entityManager.createQuery(jpql);
	query.setParameter("nm", "Kotigobba");
	query.setParameter("id", 91);
	int result=query.executeUpdate();
	transaction.commit();
}
}
