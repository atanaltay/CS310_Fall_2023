package main;


//A class in Java with a default constructor
//and encapsulated fields is called a Java Bean or POJO (Plain Old Java Object)
public class Car {
	
	//instance variables /global variables
	//they get default values
	private String color;
	private int currentSpeed;
	private boolean engineStarted;
	private String transmission;
	private int engineSize;
	protected String protField;
	
	
	public Car(){
		
	}
	
	
	public Car(String color, int currentSpeed, boolean engineStarted, String transmission, int engineSize,
			String protField) {
		super();
		this.color = color;
		this.currentSpeed = currentSpeed;
		this.engineStarted = engineStarted;
		this.transmission = transmission;
		this.engineSize = engineSize;
		this.protField = protField;
	}


	public Car(String color,String transmission,int engineSize){
		
		//to prevent variable shadowing
		this.color = color;
		this.transmission = transmission;
		this.engineSize = engineSize;
		
	}
	
	public void startEngine() {
		
		engineStarted = true;
		
		
	}
	
	public void increaseSpeed() {
		if(engineStarted) {
			currentSpeed+=10;
		}else {
			System.out.println("ENgine not started!");
		}
	}
	

	public void increaseSpeed(int by) {
		
		if(engineStarted) {
			currentSpeed+=by;
		}else {
			System.out.println("ENgine not started!");
		}
		
		
	}
	
	public void stopCar() {
		currentSpeed = 0;
		engineStarted = false;
				
	}
	
	public String getInfo() {
		
		String retVal = "Color:" + color + "\n";
		retVal += "current spped:" + currentSpeed + "\n";
		retVal+= "engine started?" + engineStarted;
		
		return retVal;
		
	}
	
	//setters and getters for encapsulation
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}


	public int getCurrentSpeed() {
		return currentSpeed;
	}


	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}


	public int getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
	
	
	

}
