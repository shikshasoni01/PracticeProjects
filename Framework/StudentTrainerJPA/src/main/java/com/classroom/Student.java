package com.classroom;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="student_name")
	private String studentName;
	@Column(name="rollNo")
	private String rollNumber;
	@Column(name="date_of_birth")
	private String birthDate;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="trainer_id")
	private Trainer trainer;
	
	public Student() {
		
	}

	public Student(String studentName, String rollNumber, String birthDate, Trainer trainer) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.birthDate = birthDate;
		this.trainer = trainer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
}
