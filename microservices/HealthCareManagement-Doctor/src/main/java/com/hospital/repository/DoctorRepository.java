package com.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>{

	@Query( "select d from Doctor d where d.doctorSpecialization =?1")//?1 parameter at 1 index
	public List<Doctor> getAllDoctorBySpecialization(String spec);
	
	@Query( "select distinct(d) from Doctor d where d.doctorSpecialization =?1")//?1 parameter at 1 index
	public Doctor getDoctorBySpecialization(String spec);
}
