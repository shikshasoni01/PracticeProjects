package com.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_table")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="patient_name")
	private String patientName;
	@Column(name="patient_age")
	private int patientAge;
	@Column(name="patient_address")
	private String patientAddress;
	@Column(name="patient_issue")
	private String patientIssue;
	@Column(name="doctor_name")
	private String doctorName;
	@Column(name="doctor_specialization")
	private String doctorSpecialization;
	public Patient() {
		
	}
	public Patient(String patientName, int patientAge, String patientAddress, String patientIssue, String doctorName,
			String doctorSpecialization) {
		
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientAddress = patientAddress;
		this.patientIssue = patientIssue;
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientIssue() {
		return patientIssue;
	}
	public void setPatientIssue(String patientIssue) {
		this.patientIssue = patientIssue;
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
	
	
	
	
}
