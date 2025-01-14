package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Patient;
import com.hospital.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public Patient createPatient(Patient patient)
	{
		return patientRepository.save(patient);
	}
	public List<Patient> getAllPatient()
	{
		return patientRepository.findAll();
	}
}
