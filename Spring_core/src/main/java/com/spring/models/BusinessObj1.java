package com.spring.models;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BusinessObj1 implements ApplicationContextAware {
	ApplicationContext context;
private BusinessObj2 obj2;

@Override
public void setApplicationContext(ApplicationContext arg0)
		throws BeansException {
	this.context =arg0;
	 this.setObj2((BusinessObj2)this.context.getBean("businessObj2"));
	// TODO Auto-generated method stub
	
}

public BusinessObj2 getObj2() {
	return obj2;
}

public void setObj2(BusinessObj2 obj2) {
	this.obj2 = obj2;
}



}
