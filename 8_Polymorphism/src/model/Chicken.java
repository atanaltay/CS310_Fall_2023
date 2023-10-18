package model;

public class Chicken extends Animal implements Eatable{

	@Override
	public void getFed() {
		
		System.out.println("Chicken got fed..");
	}

	@Override
	public void makeSound() {
		System.out.println("Chicken sound");
		
	}

	@Override
	public void howToEat() {
		System.out.println("Boil and make soup");
		
	}

	
	
	
}
