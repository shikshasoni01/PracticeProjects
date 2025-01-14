package com.productinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		SuperMarket super1= (SuperMarket) context.getBean("super1");
		super1.printInfo();
		SuperMarket super2= (SuperMarket) context.getBean("super2");
		super2.printInfo();
		
	}

}
