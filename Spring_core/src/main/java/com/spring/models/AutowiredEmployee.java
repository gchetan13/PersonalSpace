package com.spring.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredEmployee {
	private String name;
	@Autowired(required=true)
	private AutowiredAddress address;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public AutowiredEmployee(String name) {
	super();
	this.name = name;
}
public AutowiredEmployee() {
	// TODO Auto-generated constructor stub
}

public AutowiredEmployee(String name, AutowiredAddress address) {
	super();
	this.name = name;
	this.address = address;
}

public AutowiredAddress getAddress() {
	return address;
}

public void setAddress(AutowiredAddress address) {
	this.address = address;
}

@Override
public String toString() {
	return "AutowiredEmployee [name=" + name + ", address=" + address + "]";
}


}
