
package onetomanybi.controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {

	
	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		System.out.println(factory);
	}
	}


