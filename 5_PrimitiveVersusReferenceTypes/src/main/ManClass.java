package main;

public class ManClass {

	
	public static void main(String[] args) {
		
		int i = 20;
		
		
		ValueChanger changer = new ValueChanger();
		changer.changeValue(i);
		
		//i's value is copied and passed to te method
		//pass by value
		System.out.println("i is "+i);
		
		Car aCar = new Car("Blue", "Auto", 1200);
		
		
		//Pass-by-reference
		CarPainter painter = new CarPainter();
		painter.paintCar(aCar, "yellow");
		
		
		System.out.println("Car's color is "  +aCar.getColor() );
		
		
		Car secondCar = aCar;
		
		
		secondCar.setColor("Black");
		
		
		System.out.println("aCar:" + aCar.getColor());
		System.out.println("secondCar:" + secondCar.getColor());
		

	
	}
	
	
}
