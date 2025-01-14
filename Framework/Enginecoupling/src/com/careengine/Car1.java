package com.careengine;

public class Car1 {

	//loosly couple through interface
	private Engine engine;
	public Car1(Engine engine)
	{
		this.engine=engine;
	}
	public void drive()
	{
		engine.start();
		System.out.println("car is started now!");
		
	}
}
