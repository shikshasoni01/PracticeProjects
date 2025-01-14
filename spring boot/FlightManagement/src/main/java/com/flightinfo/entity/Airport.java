package com.flightinfo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.annotation.Id;

@Entity
@Table(name = "airport_details")
public class Airport {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    @Column(name="airport_name")
    private String name;

    @Column(name="city")
    private String city;

    @Column(name="service")
    private String service;  //Domestic / International

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
    
    
}
