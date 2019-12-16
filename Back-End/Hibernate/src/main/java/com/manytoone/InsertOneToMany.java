package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.onetoone.Employee_info;

public class InsertOneToMany {
public static void main(String[] args) {
	/*Employee_info e=new Employee_info();
	e.setEid(2);
	e.setEmail("Akshay@123");
	e.setEname("Akshay");
	e.setPassword("12345");
	EmployeeCompanyInfo d=new EmployeeCompanyInfo();
	d.setCompanyName("Capgemini");
	d.setExpId(32);
	d.setNoOfYear(4);
	d.setEmployee_info(e);
	EmployeeCompanyInfo d1=new EmployeeCompanyInfo();
	d1.setCompanyName("tyss");
	d1.setExpId(33);
	d1.setNoOfYear(5);
	d1.setEmployee_info(e);*/
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	transaction.begin();
	/*entityManager.persist(d1);
	entityManager.persist(d);*/
	Employee_info e5=entityManager.find(Employee_info.class, 4);
	System.out.println(e5.getE4());
	transaction.commit();
	
}
}
