package main;

//main.MainClass
public class MainClass {

	public static void main(String[] args) {
		
		
		//Defining an object
		//instantiating an object
		
		Car car1 = new Car();
		
		System.out.println("Color of the car:");
		System.out.println(car1.color);
		
		System.out.println("Current speed of the car:");
		System.out.println(car1.currentSpeed);
		
		System.out.println("-----------------");
		
		
		car1.startEngine();
		System.out.println("State:" + car1.getInfo());
		car1.increaseSpeed(100);
		System.out.println("State:" + car1.getInfo());
		car1.stopCar();
		System.out.println("State:" + car1.getInfo());
		
		//We may also access and change the state
		car1.color = "red";
		car1.currentSpeed = 100;
		
		
		
		Car car2 = new Car("red", "manuel", 1200);
		System.out.println(car2.getInfo());
		
	}
	
	
}
