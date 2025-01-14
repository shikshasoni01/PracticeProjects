package com.careengine;

public class Car {

	private PetrolEngine petrolEngine;
	
	// if we want to add new engine then we have to change car everytime
	Car()
	{
		petrolEngine= new PetrolEngine();// tight coupling
		
	}
	public void drive()
	{
		petrolEngine.start();
		System.out.println("car is started now!");
		
	}
}
