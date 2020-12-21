package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.models.AbstractEmployee;
import com.spring.models.AddressPrototype;
import com.spring.models.AutowiredEmployee;
import com.spring.models.BusinessObj1;
import com.spring.models.BusinessObj2;
import com.spring.models.Employee;
import com.spring.models.EmployeeCallback;
import com.spring.models.RequestProcessor;
import com.spring.models.RequestValidator;
import com.spring.models.SingletonEmployee;
import com.spring.models.StudentSingleton;
import com.spring.models.Triangle;


public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// ClassPathResource resource =	new ClassPathResource("spring.xml");
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	 System.out.println(context.getBeanDefinitionNames());
	 System.out.println("Singleton");
	 Employee employee1 = (Employee) context.getBean("employee1");
	 System.out.println(employee1+" "+employee1.hashCode());
	 employee1.setEmpName("Pooja");
		Employee employee5= (Employee) context.getBean("employee1");
		System.out.println(employee5+" "+employee5.hashCode());
	System.out.println("Prototype");
	 Employee employee2 = (Employee) context.getBean("employee2");
	 System.out.println(employee2+" "+employee2.hashCode());
	 employee2.setDept("Telecom");
		Employee employee6= (Employee) context.getBean("employee2");
		System.out.println(employee6+" "+employee6.hashCode());
	 Employee employee3 = (Employee) context.getBean("employee3");
	 employee3.setEmpid(321);
	 Employee employee7= (Employee) context.getBean("employee3");
		System.out.println("default scope "+employee7.getEmpid());
	 Employee employee4 = (Employee) context.getBean("employee4");
	 
	 EmployeeCallback callback = (EmployeeCallback)context.getBean("employeeCallBack");
	 System.out.println("Call back"+callback.getName());
	 //AbstractEmployee abstractEmployee = (AbstractEmployee) context.getBean("abstractEmployee");
	 //System.out.println(abstractEmployee);

// Prototype bean inside Singleton Bean
	 // Injecting ApplicationContext
	StudentSingleton singleton = (StudentSingleton) context.getBean("student");
	System.out.println(singleton+" "+singleton.hashCode());
	AddressPrototype prototype = new AddressPrototype("Ujjain");
	singleton.setPrototype(prototype);
	StudentSingleton singleton1 = (StudentSingleton) context.getBean(StudentSingleton.class);
	System.out.println(singleton1+" "+singleton1.hashCode());
	
	// Injecting LookupMethod
	// CGLIB (Code Generation Library) used in method look-up for injecting prototype Bean into Singleton Bean
	RequestProcessor processor = context.getBean(RequestProcessor.class);
	RequestValidator validator1 = processor.handleRequest("101  ");
	RequestValidator validator2 = processor.handleRequest("102  ");
	System.out.println("Is validator Equals "+(validator1 == validator2 ));

	// Singleton bean Inside Prototype bean
	BusinessObj1 obj1 = (BusinessObj1)context.getBean("busineesObj1");
	BusinessObj1 obj11 = (BusinessObj1)context.getBean("busineesObj11");
	BusinessObj2 obj2 =(BusinessObj2)context.getBean("businessObj2");
	System.out.println(obj1.hashCode()+"  "+ obj1.getObj2().hashCode());
	System.out.println(obj11.hashCode()+"  "+ obj11.getObj2().hashCode());
	obj1.setObj2(obj2);
	System.out.println(obj1.hashCode()+"  "+ obj1.getObj2().hashCode());
//	context.close();
//	context.getBean("busineesObj1");
	
	AutowiredEmployee autowiredEmployee = (AutowiredEmployee) context.getBean("autowiredEmployee");
	System.out.println(autowiredEmployee);
	
	
	// Inner bean
	Triangle triangle = context.getBean(Triangle.class);
	System.out.println("Triangle");
	System.out.println(triangle);
	}

}
