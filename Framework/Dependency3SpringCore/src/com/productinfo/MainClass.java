package com.productinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Customer cust1= (Customer) context.getBean("customer1");
		cust1.printInfo();
		
		Customer cust2= (Customer) context.getBean("customer2");
		cust2.printInfo();
		
		
	}

}
