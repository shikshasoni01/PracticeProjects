package com.student;



public class Trainer {

	private int id ;
	private String name;
	private String subject;
	private int experience;
	private double salary;
	
	
	public Trainer() {
		
	}
	public Trainer(int id, String name, String subject, int experience, double salary) {
		
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.experience = experience;
		this.salary = salary;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", subject=" + subject + ", experience=" + experience
				+ ", salary=" + salary + "]";
	}
	
	
}
