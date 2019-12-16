package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDynamically {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	String jpql="Insert into Movie values(:id,:name,:rating)";
	Query query=entityManager.createNativeQuery(jpql);
	query.setParameter("id", 120);
	query.setParameter("name", "chamak");
	query.setParameter("rating", "bad");
	int t=query.executeUpdate();
	transaction.commit();
	System.out.println(t);
}
}
