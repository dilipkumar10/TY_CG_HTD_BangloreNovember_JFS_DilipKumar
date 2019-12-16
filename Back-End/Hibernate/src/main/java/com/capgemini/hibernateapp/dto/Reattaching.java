package com.capgemini.hibernateapp.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Reattaching {
public static void main(String[] args) {
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	transaction.begin();
	Movie record=entityManager.find(Movie.class, 1);
	System.out.println(entityManager.contains(record));
	entityManager.detach(record);
	System.out.println(entityManager.contains(record));
	Movie record1=entityManager.merge(record);
	record1.setMname("KGF9");
	record1.setRating("better");
	transaction.commit();
	entityManager.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
