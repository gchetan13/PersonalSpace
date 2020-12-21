package com.spring.models;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class StudentSingleton implements ApplicationContextAware{
private String name;
private AddressPrototype prototype;
private ApplicationContext context;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public AddressPrototype getPrototype() {
	return context.getBean(AddressPrototype.class);
}
public void setPrototype(AddressPrototype prototype) {
	this.prototype = prototype;
}
public StudentSingleton(String name, AddressPrototype prototype) {
	super();
	this.name = name;
	this.prototype = prototype;
}
public void setApplicationContext(ApplicationContext arg0)
		throws BeansException {
	// TODO Auto-generated method stub
	context = arg0;
	
}
@Override
public String toString() {
	return "StudentSingleton [name=" + name + ", prototype=" + prototype + "]";
}


}
