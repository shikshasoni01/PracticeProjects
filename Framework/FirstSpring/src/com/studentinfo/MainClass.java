package com.studentinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student= (Student)  context.getBean("student1");
		System.out.println(student.toString());
		Student student11= (Student)  context.getBean("student2");
		System.out.println(student11.toString());
		Student student33 =(Student) context.getBean("student3");
		System.out.println(student33.toString());
		
//		Resource r=new ClassPathResource("applicationContext.xml");  
//        BeanFactory factory=new XmlBeanFactory(r);  
//          
//        Student s=(Student)factory.getBean("student3"); 
//        System.out.println(s.toString());
	}

}
