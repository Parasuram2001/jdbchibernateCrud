package project777;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory a = Persistence.createEntityManagerFactory("sami");
		EntityManager b = a.createEntityManager();
		EntityTransaction c=b.getTransaction();
		
		//Adding
//		Trainee details = new Trainee();
//		details.setName("mahi");
//		details.setAddress("rajajinagar");
//		details.setPhone_no(6783456789l);
//		c.begin();
//		b.persist(details); //adding
//		c.commit();
		
		//fetching the details
//		Trainee j = b.find(Trainee.class, 1);
//		System.out.println(j);
		
		//updating
//		Trainee j= b.find(Trainee.class, 1);
//		if(j!=null)
//		{
//			j.setName("rohit");
//			c.begin();
//			b.merge(j);
//			c.commit();
//		}
//		else {
//			System.out.println(" No id found ");
//		}
		
		//remove the deta/details
		Trainee m = b.find(Trainee.class, 1);
		if(m!=null)
		{
			c.begin();
			b.remove(m);
			c.commit();
		}
		else {
			System.out.println(" No id found.");
		}
		

	}

}
