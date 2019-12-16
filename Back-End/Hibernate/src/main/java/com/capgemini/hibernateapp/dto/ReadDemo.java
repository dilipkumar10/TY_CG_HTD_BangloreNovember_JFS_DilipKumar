package com.capgemini.hibernateapp.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie record = entityManager.find(Movie.class, 1);
		System.out.println("id=" + record.getMid());
		System.out.println("name=" + record.getMname());
		System.out.println("Rating=" + record.getRating());
		entityManager.close();
	}
}
