package com.hospital.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospital.entity.Patient;
import com.hospital.entity.Doctor;
import com.hospital.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private  DiscoveryClient client;
	
	
	@GetMapping("/getAllPatient")
	public List<Patient> getAllPatient()
	{
		
		return patientService.getAllPatient();
		
	}
	
	@PostMapping("/addPatient/{speciallization}")
	public Patient createPatient(@RequestBody Patient patient,@PathVariable String speciallization)
	{
		List<ServiceInstance> services=client.getInstances("HealthcareManagement-Doctor");//multiple project can be added seperated by comma
		ServiceInstance doctorServiceInstance= services.get(0);//index of list where doctor service project is present
		
		URI uri = doctorServiceInstance.getUri();//http://localhost:8001
		
		Doctor doctor= new RestTemplate().getForObject(uri+"/doctor/getDoctor/"+speciallization, Doctor.class);
		patient.setDoctorName(doctor.getDoctorName());
		patient.setDoctorSpecialization(doctor.getDoctorSpecialization());
		
		return patientService.createPatient(patient);
		
	}
}
