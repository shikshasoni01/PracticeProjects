package com.hospital.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Doctor;
import com.hospital.repository.DoctorRepository;
import com.hospital.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired 
	private DoctorService  doctorService;
	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/getDoctor/{specialization}")
	public Doctor getDoctor(@PathVariable String specialization)
	{
		
		return doctorService.getDoctorBySpeciallization(specialization);
		
	}
	@GetMapping("/getAllDoctor")
	public List<Doctor> getAllDoctor(@PathVariable String specialization)
	{
		
		return doctorService.getAllDoctorBySpeciallization(specialization);
		
	}
	//create new record 
	@PostMapping("/addDoctor")
	public void createDoctor(@RequestBody Doctor doctor)
	{
		
		 doctorService.createDoctor(doctor);
		
	}
	
	@PutMapping("/updateDoctor/{id}")
	public void updateDoctor(@PathVariable Long id,@RequestBody Doctor doctor)
	{
		
		Optional<Doctor> doctorcopy = doctorRepository.findById(id);
		Doctor doctor1=doctorcopy.get();
		if(doctor1!=null) {
		doctor1.setDoctorName(doctor.getDoctorName());
		doctor1.setDoctorSpecialization(doctor.getDoctorSpecialization());
		doctor1.setDoctorExperience(doctor.getDoctorExperience());
		 doctorService.updateDoctor(doctor1);
		}
		doctorService.updateDoctor(doctor);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable Long id)
	{
		
		doctorService.deleteDoctor(id);
		
	}
	
}
