package model;

public class Animal {
	
	private int numberOfLegs;
	private String habitat;
	

	
	public void makeSound() {
		
		System.out.println("No sound");
		
	}
	
	public Animal(int numberOfLegs, String habitat) {

		this.numberOfLegs = numberOfLegs;
		this.habitat = habitat;
		
		System.out.println("Animal constructor");
		
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	
	
}
