package onetomanybi.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddTheEmployeeForTheDepartment {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Employee e=new Employee();
	
}
