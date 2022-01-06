package com.java.jdbc;
public class Resturant {
private int resturantId;
private  String resturantName;
private String city;
private String branch;
private String email;
private int contact;
public int getResturantId() {
	return resturantId;
}
public void setResturantId(int resturantId) {
	this.resturantId = resturantId;
}
public String getResturantN() {
	return resturantName;
}
public void setResturantName(String resturantName) {
	this.resturantName = resturantName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Resturant [resturantId=" + resturantId + ", resturantName=" + resturantName + ", city=" + city + ", branch="
			+ branch + ", email=" + email + ", contact=" + contact + "]";
}
	
}

