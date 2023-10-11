package main;

//Class identifiers begin with capital letters
public class Car {
	
	//State
	//no acces modifier -> protected access
	String color = "blue";
	int currentSpeed = 0;
	boolean engineStarted = false;
	String transmission = "auto";
	int engineSize = 1599;
	
	//Default constructor
	//If you dont define a constructor explicitly
	//Java creates the default constructor implicitly.
	
	public Car(){
		
	}
	
	//overloading the constructor
	//Constructors
	//Non-default constructor
	//if you have at least one non-default constructor
	// java doesnt create a default constructor implicitly
	public Car(String _color,String _transmission,int _engineSize){
		
		color = _color;
		transmission = _transmission;
		engineSize = _engineSize;
		
	}
	
	//Method signature -> name of the method + parameter type list
	// doSomething() -> overloaded: doSomething(String str)
	// overloaded -> doSomething(int i)
	// compiler error -> doSomething(String name)
	void startEngine() {
		
		engineStarted = true;
		
		
	}
	
	void increaseSpeed() {
		if(engineStarted) {
			currentSpeed+=10;
		}else {
			System.out.println("ENgine not started!");
		}
	}
	
	//Not overloading, compiler error
	/*
	void increaseSpeed(int speed) {
		
	}
	*/
	
	void increaseSpeed(int by) {
		
		if(engineStarted) {
			currentSpeed+=by;
		}else {
			System.out.println("ENgine not started!");
		}
		
		
	}
	
	void stopCar() {
		currentSpeed = 0;
		engineStarted = false;
				
	}
	
	String getInfo() {
		
		String retVal = "Color:" + color + "\n";
		retVal += "current spped:" + currentSpeed + "\n";
		retVal+= "engine started?" + engineStarted;
		
		return retVal;
		
	}

}
