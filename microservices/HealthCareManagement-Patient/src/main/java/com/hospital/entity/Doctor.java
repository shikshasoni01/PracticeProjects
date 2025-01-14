package com.hospital.entity;



//we are creating a class to store the reference of Doctor which is coming from Doctor project
public class Doctor {

	
	private long doctorId;
	private String doctorName;
	private String doctorSpecialization;
	private int doctorExperience;
	public Doctor() {
		
	}
	public Doctor(long doctorId, String doctorName, String doctorSpecialization, int doctorExperience) {
		
		this.doctorId = doctorId;
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
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorSpecialization="
				+ doctorSpecialization + ", doctorExperience=" + doctorExperience + "]";
	}
	
	
}
