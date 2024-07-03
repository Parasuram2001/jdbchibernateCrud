package project11;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class sample11 {
	@Id
	@GeneratedValue
public int id;
	@Column(nullable = false)
public String name;
public String address;
@Lob
public byte[] photo;
public double fee;
@Override
public String toString() {
	return "sample11 [id=" + id + ", name=" + name + ", address=" + address + ", fee=" + fee + ", photo="
			+ Arrays.toString(photo) + "]";
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
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}
}
