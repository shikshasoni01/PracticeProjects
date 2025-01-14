package com.management.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="trainer_detail")
public class Trainer {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "trainer_name")
    private String name;
    @Column(name="profile")
    private String profile;
    @Column(name = "experience")
    private double experience;
    
    @OneToMany(mappedBy="trainer")
    private List<Student> students=new ArrayList<>();

    public Trainer() {

    }

   

    public Trainer(String name, String profile, double experience, List<Student> students) {
		super();
		this.name = name;
		this.profile = profile;
		this.experience = experience;
		this.students = students;
	}



	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }



	@Override
	public String toString() {
		return String.valueOf(id);
	}
}


