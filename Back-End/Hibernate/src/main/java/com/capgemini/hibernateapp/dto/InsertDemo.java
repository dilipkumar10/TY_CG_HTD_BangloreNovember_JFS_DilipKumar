package com.capgemini.hibernateapp.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {
public static void main(String[] args) {
	Movie m=new Movie();
	m.setMid(10);
	m.setMname("Hebbuli");
	m.setRating("good");  
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	 entityManager=entityManagerFactory.createEntityManager();
	 transaction=entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(m);
	System.out.println("record saved");
	transaction.commit();
	}catch(Exception e) {
	e.printStackTrace();
	transaction.rollback();
	}
	transaction.commit();
	entityManager.close();
}
}
