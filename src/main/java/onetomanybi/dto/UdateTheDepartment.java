package onetomanybi.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UdateTheDepartment {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Employee e=new Employee();
	e.setName("Ganesh"); 
	e.setDesignation("Q spider");
	e.setSalary(12000);
	e.setPhone(1500);
	e.setPassword(143);
	e.setId(1);
	
	
	List<Employee>employees=new ArrayList<Employee>();
	
	manager.persist(e);
	transaction.begin();
	transaction.commit();
}
}
