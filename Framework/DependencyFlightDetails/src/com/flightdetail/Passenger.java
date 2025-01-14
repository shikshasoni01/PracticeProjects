package com.flightdetail;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Passenger {

	private int id;
	private String name;
	private String passport;
	private int age;
	private String address;
	private Map<Airport,Flight> flightAir;
	
	public Passenger() {
		
	}

	public Passenger(int id, String name, String passport, int age, String address, Map<Airport, Flight> flightAir) {
		
		this.id = id;
		this.name = name;
		this.passport = passport;
		this.age = age;
		this.address = address;
		this.flightAir = flightAir;
	}

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

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Map<Airport, Flight> getFlightAir() {
		return flightAir;
	}

	public void setFlightAir(Map<Airport, Flight> flightAir) {
		this.flightAir = flightAir;
	}
	
	public void displayDetail()
	{
		System.out.println("Passenger id:"+id+" name : "+name+" passport : "+passport+" age : "+age+" address :"+address);
		Set<Entry<Airport,Flight>> entry= flightAir.entrySet();
		for(Map.Entry<Airport, Flight> val: entry)
		{
			Airport airport= val.getKey();
			Flight flight= val.getValue();
			System.out.println(airport.toString());
			System.out.println(flight.toString());
			
			
		}
		
	}
	
}
