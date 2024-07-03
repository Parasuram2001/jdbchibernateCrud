package project11;

import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EntityManagerFactory f = Persistence.createEntityManagerFactory("mahi");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		sample11 variable = new sample11();
		variable.setName("virat");
		variable.setAddress("rajajinagar");
		variable.setFee(3456754.898);
		
		//FileInputStream is used to get the file from local storage to java.
		FileInputStream fis = new FileInputStream("C:\\Users\\parashuram\\Desktop\\TypingMaster\\tmaster.exe");
		//create an empty array to store a file, available() is non static which is used to get the size of the file.
		byte[] arr = new byte[fis.available()];
		//read will initialize the empty array with provided file.
		fis.read(arr);
		//setPhoto() is used to set the file for the object.
		//upto 4 gb of size we can insert any photos, videos, apks etc but mysql doesnot support, we can insert below 100mb
		variable.setPhoto(arr);
		t.begin();
		m.persist(variable);
		t.commit();

	}

}
