package com.mobileinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Mobile mobile1= (Mobile)  context.getBean("mobile1");
		System.out.println(mobile1.toString());
		Mobile mobile2= (Mobile)  context.getBean("mobile2");
		System.out.println(mobile2.toString());
		Mobile mobile3= (Mobile)  context.getBean("mobile3");
		System.out.println(mobile3.toString());
		Mobile mobile4= (Mobile)  context.getBean("mobile4");
		System.out.println(mobile4.toString());
		Mobile mobile5= (Mobile)  context.getBean("mobile5");
		System.out.println(mobile5.toString());
		Mobile mobile6= (Mobile)  context.getBean("mobile6");
		System.out.println(mobile6.toString());
		Mobile mobile7= (Mobile)  context.getBean("mobile7");
		System.out.println(mobile7.toString());
		Mobile mobile8= (Mobile)  context.getBean("mobile8");
		System.out.println(mobile8.toString());
		Mobile mobile9= (Mobile)  context.getBean("mobile9");
		System.out.println(mobile9.toString());
		Mobile mobile10= (Mobile)  context.getBean("mobile10");
		System.out.println(mobile10.toString());
		
		Mobile mobile11= (Mobile)  context.getBean("mobile11");
		System.out.println(mobile11.toString());
		Mobile mobile22= (Mobile)  context.getBean("mobile22");
		System.out.println(mobile22.toString());
		Mobile mobile33= (Mobile)  context.getBean("mobile33");
		System.out.println(mobile33.toString());
		Mobile mobile44= (Mobile)  context.getBean("mobile44");
		System.out.println(mobile44.toString());
		Mobile mobile55= (Mobile)  context.getBean("mobile55");
		System.out.println(mobile55.toString());
		Mobile mobile66= (Mobile)  context.getBean("mobile66");
		System.out.println(mobile66.toString());
		Mobile mobile77= (Mobile)  context.getBean("mobile77");
		System.out.println(mobile77.toString());
		Mobile mobile88= (Mobile)  context.getBean("mobile88");
		System.out.println(mobile88.toString());
		Mobile mobile99= (Mobile)  context.getBean("mobile99");
		System.out.println(mobile99.toString());
		Mobile mobile100= (Mobile)  context.getBean("mobile100");
		System.out.println(mobile100.toString());
	}

}
