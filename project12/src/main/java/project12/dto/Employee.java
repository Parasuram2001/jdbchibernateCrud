package project12.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	String name;
	String address;
	@Id
	int houseNo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", houseNo=" + houseNo + "]";
	}
	
	
	
}
