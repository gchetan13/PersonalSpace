package com.spring.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.cglib.beans.BeanGenerator;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.FixedValue;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.Mixin;


public class CGLibExample {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Enhancer enhancer =new Enhancer();
	enhancer.setSuperclass(ProxyService.class);
	enhancer.setCallback((FixedValue) ()->"Hello Chetan");
	ProxyService proxyService =  (ProxyService) enhancer.create();
	System.out.println(proxyService.sayHello(" Gupta"));

	// This will tell which methods to intercept
	Enhancer enhancer1 = new Enhancer();
	enhancer1.setSuperclass(ProxyService.class);
	enhancer1.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> {
	    if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
	        return "Hello Tom!";
	    } else {
	        return proxy.invokeSuper(obj, args1);
	    }
	});
	ProxyService service1 = (ProxyService) enhancer1.create();
	System.out.println(service1.sayHello("Surabhi"));
	
	Enhancer enhancer2 = new Enhancer();
	enhancer2.setSuperclass(ProxyService.class);
	enhancer2.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> {
	    if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class && method.getName().equals("getRollNumber") ) {
	        return "12";
	    } else {
	        return proxy.invokeSuper(obj, args1);
	    }
	});
	
	ProxyService service = (ProxyService) enhancer2.create();
	System.out.println(service.getRollNumber(111));
	
	
	// Bean Creator
	BeanGenerator generator = new BeanGenerator();
	generator.addProperty("name", String.class);
	Object mybean = generator.create();
	Method setName = mybean.getClass().getMethod("setName", String.class);
	setName.invoke(mybean, "Chetan Gupta");
	Method getName = mybean.getClass().getMethod("getName");
	System.out.println(getName.invoke(mybean));
	
	// Creating Mixin
	
	Mixin mixin =Mixin.create(new Class[] {Interface1.class,Interface2.class,MixinInterface.class}, new Object[]{new Class1(),new Class2()});
	MixinInterface mixinInterface = (MixinInterface)mixin;
	System.out.println(mixinInterface.name1("!"));
	System.out.println(mixinInterface.name2("*"));

}
}
