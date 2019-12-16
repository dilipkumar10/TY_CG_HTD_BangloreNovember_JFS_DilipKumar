package MnayToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.onetoone.Employee_info;

public class TestManyToMany {
public static void main(String[] args) {
	Employee_info e=new Employee_info();
	e.setEid(8);
	e.setEmail("Sunitha@123");
	e.setEname("Sunitha");
	
	Employee_info e1=new Employee_info();
	e1.setEid(10);
	e1.setEmail("rama@123");
	e1.setEname("rama");
	
	ArrayList<Employee_info> a=new ArrayList<Employee_info>();
	a.add(e);
	a.add(e1);
	ArrayList<Employee_info> a1=new ArrayList<Employee_info>();
	a1.add(e);
	a1.add(e1);
	
//	Training_info t=new Training_info();
//	t.settId(1);
//	t.settName("Javafs");
//	t.seteList(a);
	
	Training_info t1=new Training_info();
	t1.settId(2);
	t1.settName("Javafs course");
	t1.seteList(a1);
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	transaction.begin();
//	entityManager.persist(t);
	entityManager.persist(t1);
	transaction.commit();
	
}
}
