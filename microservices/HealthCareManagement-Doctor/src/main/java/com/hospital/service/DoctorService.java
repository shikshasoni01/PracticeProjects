package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Doctor;
import com.hospital.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	public Doctor getDoctorBySpeciallization(String specialization)
	{
		return doctorRepository.getDoctorBySpecialization(specialization);
	}
	
	public List<Doctor> getAllDoctorBySpeciallization(String specialization)
	{
		return doctorRepository.getAllDoctorBySpecialization(specialization);
	}
	

	public void createDoctor(Doctor doctor)
	{
		doctorRepository.save(doctor);
	}
	
	public void updateDoctor(Doctor doctor)
	{
		doctorRepository.save(doctor);
	}
	
	public void deleteDoctor(Long id)
	{
		doctorRepository.deleteById(id);
	}
}

