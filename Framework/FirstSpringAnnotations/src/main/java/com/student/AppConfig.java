package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.student")
public class AppConfig {
	
	
	@Bean(name="trainer1")
	public Trainer createTrainer1()
	{
		Trainer trainer1 = new Trainer(001,"Ritesh ","Core java",15,50000);
		return trainer1;
	}
	//only one trainer reference is required for student when we autowired trainer
	//autowired means giving one class reference to another class automatically without giving any reference of the class  
//	@Bean(name="trainer2")
//	public Trainer createTrainer2()
//	{
//		Trainer trainer1 = new Trainer(001,"Nilesh ","Frontend",10,30000);
//		return trainer1;
//	}
//	@Bean(name="trainer3")
//	public Trainer createTrainer3()
//	{
//		Trainer trainer1 = new Trainer(001,"Ritesh ","Advance java",8,20000);
//		return trainer1;
//	}
	@Bean(name="student1")
	public Student createStudent1()
	{
		Student student1 = new Student(101,"Ayushi","Bhopal",24);
		return student1;
	}
	@Bean(name="student2")
	public Student createStudent2()
	{
		Student student1 = new Student(102,"Hitesh","Indore",30);
		return student1;
	}
	@Bean(name="student3")
	public Student createStudent3()
	{
		Student student1 = new Student(103,"Tanishq","Gujrat",20);
		return student1;
	}
	
	//trainer reference in student using constructor
//	@Bean(name="student1")	
//	public Student createStudent()
//	{
//		Student student1 = new Student(101,"Ayushi","Bhopal",24,createTrainer());
//		return student1;
//	}
		//create bean for data insertion
//	@Bean(name="student1")
//	public Student createStudent()
//	{
//		Student student1 = new Student(101,"Ayushi","Bhopal",24);
//		return student1;
//	}
	
//	@Bean(name="student2")
//	public Student createStudent1()
//	{
//		Student student1 = new Student();
//		student1.setId(102);
//		student1.setName("Disha");
//		student1.setAddress("Indore");
//		student1.setAge(30);
//		return student1;
//	}
	
	
}
