package com.productinfo;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

	private int id;
	private String name;
	
	public SuperMarket() {
		
	}


	public SuperMarket(int id, String name) {
		
		this.id = id;
		this.name = name;
		
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


	@Override
	public String toString() {
		return "SuperMarket [id=" + id + ", name=" + name + "]";
	}



	
	
}
