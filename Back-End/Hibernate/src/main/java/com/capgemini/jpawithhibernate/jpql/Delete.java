package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	String jpql="delete from Movie where mid=2 or mid=9";
	transaction.begin();
	Query query=entityManager.createQuery(jpql); 
	int t=query.executeUpdate();
	System.out.println(t);
	transaction.commit();
}
}
