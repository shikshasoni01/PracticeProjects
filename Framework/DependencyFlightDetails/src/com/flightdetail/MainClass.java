package com.flightdetail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Passenger pass1= (Passenger) context.getBean("passenger1");
		pass1.displayDetail();
		System.out.println("---------------------------");
		Passenger pass2= (Passenger) context.getBean("passenger2");
		pass2.displayDetail();
		System.out.println("---------------------------");
		Passenger pass3= (Passenger) context.getBean("passenger3");
		pass3.displayDetail();
		System.out.println("---------------------------");
		Passenger pass4= (Passenger) context.getBean("passenger4");
		pass4.displayDetail();
	}

}