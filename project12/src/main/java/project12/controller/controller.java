package project12.controller;

import project12.dao.EmployDao;
import project12.dto.Employee;

public class controller {
	String nami = "sam";
	String addre = "west Indis";
	int id = 17;
	
	public static void main(String[] args) {
		
//		controller c = new controller();
//		Employee y = new Employee();
//		y.setName(c.nami);
//		y.setAddress(c.addre);
//		y.setHouseNo(c.id);
		
		EmployDao d = new EmployDao();
		d.update(17,"karun");
		
	}
	
}
