package com.spring.models;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EmployeeCallback  implements BeanPostProcessor,InitializingBean,DisposableBean{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeCallback(String name) {
		super();
		this.name = name;
	}
	public EmployeeCallback() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Post Process Before Initialization");
		return arg0;
	}
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Post Process After Initialization");
		return arg0;
	}

	public void afterPropertiesSet(){
		System.out.println("In After Properties Set ");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EmployeecallBack destroyed");
		
	}
}
