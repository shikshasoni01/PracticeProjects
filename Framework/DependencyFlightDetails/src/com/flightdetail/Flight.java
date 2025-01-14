package com.flightdetail;

public class Flight {

	private String id;
	private String name;
	private String departure;
	private String destination;
	private double price;
	public Flight() {
		
	}
	public Flight(String id, String name, String departure, String destination, double price) {
		
		this.id = id;
		this.name = name;
		this.departure = departure;
		this.destination = destination;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", departure=" + departure + ", destination=" + destination
				+ ", price=" + price + "]";
	}
	
	
	
	
}
