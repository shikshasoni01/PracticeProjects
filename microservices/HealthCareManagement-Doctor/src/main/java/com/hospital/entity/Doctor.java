package com.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor_table")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long doctorId;
	@Column(name="doctor_name")
	private String doctorName;
	@Column(name="doctor_specialization")
	private String doctorSpecialization;
	@Column(name="doctor_experience")
	private int doctorExperience;
	
	
	public Doctor() {
		
	}


	public Doctor(String doctorName, String doctorSpecialization, int doctorExperience) {
		super();
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorExperience = doctorExperience;
	}


	public long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}


	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}


	public int getDoctorExperience() {
		return doctorExperience;
	}


	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}
	
	
	
	
}
