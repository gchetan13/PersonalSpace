package com.spring.models;

public class AutowiredAddress {
private String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public AutowiredAddress() {
	// TODO Auto-generated constructor stub
}

public AutowiredAddress(String city) {
	super();
	this.city = city;
}

@Override
public String toString() {
	return "AutowiredAddress [city=" + city + "]";
}

}
