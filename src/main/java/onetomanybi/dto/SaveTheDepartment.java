package onetomanybi.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTheDepartment {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Employee e=new Employee();
	e.setName("yuvakumar"); 
	e.setDesignation("j spider");
	e.setSalary(250000);
	e.setPhone(15000);
	e.setPassword(123);
	e.setId(1);
	
	List<Employee>employees=new ArrayList<Employee>();
	
	manager.persist(e);
	transaction.begin();
	transaction.commit();
}
	
}
