package com.spring.models;

public class AddressPrototype {
private String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public AddressPrototype(String city) {
	super();
	this.city = city;
}

@Override
public String toString() {
	return "AddressPrototype [city=" + city + "]";
}
public AddressPrototype() {
	// TODO Auto-generated constructor stub
}
}
