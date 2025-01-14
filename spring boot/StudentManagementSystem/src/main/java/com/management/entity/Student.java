package com.management.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "student_name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="qualification")
    private String qualification;
    @Column(name="address")
    private String address;
    
    @ManyToOne
    @JoinColumn(name="trainer_id")
    private Trainer trainer;

    public Student() {

    }

    public Student(String name, int age, String qualification, String address, Trainer trainer) {
		
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.address = address;
		this.trainer = trainer;
	}



	public Trainer getTrainer() {
		return trainer;
	}



	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}



	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
