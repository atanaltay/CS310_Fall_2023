package main;

import model.Car;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		System.out.println(car1.getInfo());
		
		//Compiler error -> protected access
		//System.out.println(car1.protField);
		
		
	}
	
	
	
}
