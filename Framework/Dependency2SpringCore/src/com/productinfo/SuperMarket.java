package com.productinfo;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

	private int id;
	private String name;
	private List<Product> products= new ArrayList<>();
	
	
	public SuperMarket() {
		
	}


	public SuperMarket(int id, String name, List<Product> products) {
		
		this.id = id;
		this.name = name;
		this.products = products;
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


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void printInfo()
	{
		System.out.println("Super Market id : "+id+" name : "+name);
		
		for(Product p : products)
		{
			System.out.println("Product id : "+p.getId()+" name : "+p.getName()+" tagline :"+p.getTagline()+" price : "+p.getPrice());

		}
	}
	
	
}
