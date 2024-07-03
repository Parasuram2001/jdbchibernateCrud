package project777;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String name;
	private String address;
	@Column(nullable = false)
	private long phone_no;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public long getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}


	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", address=" + address + ", phone_no=" + phone_no + "]";
	}

}
