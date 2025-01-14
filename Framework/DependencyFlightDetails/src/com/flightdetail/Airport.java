package com.flightdetail;

public class Airport {

	private int id;
	private String name;
	private String address;
	private String service;  //Domestic / International
	public Airport() {
		
	}
	public Airport(int id, String name, String address, String service) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.service = service;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	@Override
	public String toString() {
		return "Airport [id=" + id + ", name=" + name + ", address=" + address + ", service=" + service + "]";
	}
	
	
}
