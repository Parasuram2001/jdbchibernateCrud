package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class sample22 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
		PreparedStatement p=c.prepareStatement("update sampler set phoneno=? where name=?");
		System.out.println("enter new phonumber");
		p.setInt(1, sc.nextInt());
		System.out.println("enter name");
		p.setString(2, sc.next());
		int e=p.executeUpdate();
		c.close();
		System.out.println(e);

	}

}
