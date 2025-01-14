package com.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
//    	Student student1= (Student)context.getBean("student1");
//    	
//    	System.out.println(student1.toString());   	
//    	Student student2= (Student)context.getBean("student2");
//    	
//    	System.out.println(student2.toString());   	
//    	
    	Student student1= (Student)context.getBean("student1");
    	student1.display();   
    	System.out.println("--------------------------");
    	Student student2= (Student)context.getBean("student2");
    	student2.display(); 
    	System.out.println("--------------------------");

    	Student student3= (Student)context.getBean("student3");
    	student3.display(); 
    	
    }
}
