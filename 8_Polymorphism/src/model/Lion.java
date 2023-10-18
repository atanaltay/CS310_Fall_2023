package model;

public class Lion extends Cat{

	
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Lion(int numberOfLegs, String habitat, String favFood, String favOwner) {
		
		super(numberOfLegs, habitat, favFood);
		
		System.out.println("Lion constructor");
		
	}
	
	@Override
	public void getFed() {
		
		System.out.println("Lion ate meat..");
		
		
	}
	
	//overridden makeSound()
	public void makeSound() {
		System.out.println("Roarrrr!!");
	}
	
	
	
}
