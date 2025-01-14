package com.productinfo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Customer {

	private int id;
	private String name;
	private Map<Product,SuperMarket> prodSup;
	public Customer() {
		
	}
	public Customer(int id, String name, Map<Product, SuperMarket> prodSup) {
		
		this.id = id;
		this.name = name;
		this.prodSup = prodSup;
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
	public Map<Product, SuperMarket> getProdSup() {
		return prodSup;
	}
	public void setProdSup(Map<Product, SuperMarket> prodSup) {
		this.prodSup = prodSup;
	}
	
	public void printInfo()
	{
		System.out.println("Customer id : "+id+" name : "+name);
		Set<Entry<Product,SuperMarket>> entry= prodSup.entrySet();
		for(Map.Entry<Product, SuperMarket> val: entry)
		{
			Product p= val.getKey();
			SuperMarket sp= val.getValue();
			System.out.println(p.toString());
			System.out.println(sp.toString());
			
			
		}
		
		
		
		
		
	}
	
}
