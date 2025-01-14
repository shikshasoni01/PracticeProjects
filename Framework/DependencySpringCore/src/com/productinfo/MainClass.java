package com.productinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Product product1= (Product)  context.getBean("product1");
		//System.out.println(product1.toString());
		product1.display();
		Product product2= (Product)  context.getBean("product2");
		//System.out.println(product2.toString());
		product2.display();
		Product product3= (Product)  context.getBean("product3");
		//System.out.println(product3.toString());
		product3.display();
	}

}
