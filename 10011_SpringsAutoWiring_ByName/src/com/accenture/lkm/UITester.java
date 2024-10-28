package com.accenture.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/my_springbean.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		
		System.out.println("\n\n\nOutput is:");
		System.out.print("===============");
		employee.display();
	}
}
// name of the bean will be mapped to the variable name and will be injected if the name is same 
//by invoking the respective setter...

//check if the setter is present in the employee class or not