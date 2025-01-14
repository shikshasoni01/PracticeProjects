package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private int id;
	private String name;
	private String address;
	private int age;
	@Autowired
	private Trainer trainer;
	public Student() {
		
	}
	public Student(int id, String name, String address, int age) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		//this.trainer = trainer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public Trainer getTrainer() {
//		return trainer;
//	}
//	public void setTrainer(Trainer trainer) {
//		this.trainer = trainer;
//	}
	
	public void display()
	{
		System.out.println("Student id=" + id + ", name=" + name + ", address=" + address + ", age=" + age );
		System.out.println(trainer.toString());
	}
	
	
}
