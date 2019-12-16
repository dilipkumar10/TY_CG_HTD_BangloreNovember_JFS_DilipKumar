package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.hibernateapp.dto.Movie;

public class Access {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//String query = "from Movie";
		//Query query1 = entityManager.createQuery(query);
		String query = "select mname from Movie";
		Query query1 = entityManager.createQuery(query);
		List<String> record = query1.getResultList();
		/*for (Movie movie : record) {
			//System.out.println("Movie Id=" + movie.getMid());
			System.out.println("Movie Name=" + movie.getMname());
			//System.out.println("Movie Rating" + movie.getRating());
			System.out.println("***************************************");
		}*/
		for (String string : record) {
			System.out.println(string);
		}
	}
}
