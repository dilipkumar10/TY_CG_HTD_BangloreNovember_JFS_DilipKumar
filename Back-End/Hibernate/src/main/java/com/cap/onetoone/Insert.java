package com.cap.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		/*Employee_info obj=new Employee_info();
		obj.setEid(1);
		obj.setEmail("dilip@123");
		obj.setEname("Dilip");
		obj.setPassword("1234");
		Employee_other_info e=new Employee_other_info();
		e.setId(11);
		e.setFather_name("Ravi");
		e.setMother_naame("Sunitha");
		e.setEmployee_info(obj);*/
		Employee_info e=entityManager.find(Employee_info.class, 1);
		//System.out.println(e.getE3().getFather_name());
		transaction.begin();
		//entityManager.persist(e);
		transaction.commit();
		System.out.println("Closed");
	}
	
	
}
