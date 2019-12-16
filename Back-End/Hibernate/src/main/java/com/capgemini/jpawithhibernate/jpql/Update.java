package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	String jpql="update Movie set mname='kirataka' where mid=1";
	transaction.begin();
	Query query1 = entityManager.createQuery(jpql);
	int t=query1.executeUpdate();
	transaction.commit();
	
}
}
