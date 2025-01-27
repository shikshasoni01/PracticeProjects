package com.mobileinfo;

public class Mobile {

	private int id ;
	private String name;
	private String brand;
	private double price;
	private String colour;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int id, String name, String brand, double price, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", colour=" + colour
				+ "]";
	}
	
	
}
