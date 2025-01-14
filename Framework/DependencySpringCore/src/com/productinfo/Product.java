package com.productinfo;

public class Product {

	private int id;
	private String name;
	private String tagline;
	private double price;
	private SuperMarket superMarket;
	public Product() {
		
	}
	
	
	public Product(int id, String name, String tagline, double price, SuperMarket superMarket) {
		
		this.id = id;
		this.name = name;
		this.tagline = tagline;
		this.price = price;
		this.superMarket = superMarket;
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
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public SuperMarket getSuperMarket() {
		return superMarket;
	}


	public void setSuperMarket(SuperMarket superMarket) {
		this.superMarket = superMarket;
	}


	public void display()
	{
		System.out.println("id: "+id+" Name : "+name+" tagline : "+tagline+" price: "+price);
		System.out.println(superMarket.toString());
	}
	
	
	
}
