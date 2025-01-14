package com.careengine;

public class MainClass {

	public static void main(String[] args) {
		
		Engine engine= new DieselEngine();
		
		//tight coupling
		Car car1= new Car();
		car1.drive();
		
		
		//loose coupling
		Car1 car11= new Car1(engine);
		car11.drive();

	}

}
