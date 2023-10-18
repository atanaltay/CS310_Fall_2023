package model;

public class Lion extends Cat{

	public Lion(int numberOfLegs, String habitat, String favFood, String favOwner) {
		
		super(numberOfLegs, habitat, favFood);
		
		System.out.println("Lion constructor");
		
	}
	
	//overridden makeSound()
	public void makeSound() {
		System.out.println("Roarrrr!!");
	}
	
	
	
}
