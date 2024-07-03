package sampleproject;

import java.sql.*;

public class demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
		PreparedStatement p=c.prepareStatement("insert into sampler values('pasha',7890657)");
		p.execute();
		c.close();
		System.out.println("database created");

	}

}
