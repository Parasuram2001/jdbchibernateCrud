package project45;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		//EntityManagerFactory, it is used to map the persistence file.
		//using persistence file we can connect with database.
		EntityManager e = f.createEntityManager();
		//EntityManager,it give inbuilt methods to perform CRUD operation.
		EntityTransaction t = e.getTransaction();
		//EntityTransaction, it is used to open and close the connection with database.
//	Adding
//		Student s = new Student();
//		s.setNumber(788551245l);
//		s.setAddress("beng");
//		s.setName("ram");
//		t.begin();
//		e.persist(s);
//		t.commit();
		
		//fetching

//		Student s = e.find(Student.class, 3);//3 is the primary key value
//		System.out.println(s);

		//deleting
//		Student s1 = e.find(Student.class, 2);
//		t.begin();
//		e.remove(s1);
//		t.commit();

		//updating
		Student a = e.find(Student.class, 4);
		a.setAddress("tumkur");
		t.begin();
		e.merge(a);
		t.commit();

	}
}
