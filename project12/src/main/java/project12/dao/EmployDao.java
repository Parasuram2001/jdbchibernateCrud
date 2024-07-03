package project12.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import project12.controller.controller;
import project12.dto.Employee;

public class EmployDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
//	public void add(Employee combi)
//	{
//		et.begin();
//		em.persist(combi);
//		et.commit();
//	}
	
//	public void fetch(int i)
//	{
//		Employee y = em.find(Employee.class, i);
//		System.out.println(y);
//	}
	public void update(int i,String name)
	{
		Employee y = em.find(Employee.class, i);
		y.setName(name);
		et.begin();
		em.merge(y);
		et.commit();
	}
}
