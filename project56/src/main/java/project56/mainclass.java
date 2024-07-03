package project56;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory a = Persistence.createEntityManagerFactory("virat");
		EntityManager b = a.createEntityManager();
		EntityTransaction c=b.getTransaction();
		
		Random generate = new Random();
		int[] arr1 = new int[3];
		for(int i=0;i<=2;i++)
		{
			arr1[i] = generate.nextInt(10);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String nam =sc.next();
		
		
		int no = 0;
		int[] arr2 = new int[3];
		for(int i=0;i<=2;i++)
		{
			System.out.println("guess the number between 0 to 10");
			arr2[i] =sc.nextInt();
			if(arr1[i]==arr2[i])
			{
				no = no+10;
				System.out.println("good");
			}
			else {
				System.out.println("wrong guess");
			}
		}
		System.out.println("generated number --> "+Arrays.toString(arr1));
		System.out.println("entered number --> "+Arrays.toString(arr2));
		System.out.println("your score is --> "+no);
		
		sample variable = new sample();
		variable.setName(nam);
		variable.setScore(no);
		variable.setEnteredNumber(Arrays.toString(arr1));
		variable.setGuessNumber(Arrays.toString(arr2));
	
		c.begin();
		b.persist(variable);
		c.commit();
	}

}
