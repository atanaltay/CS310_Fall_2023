package model;

public class HouseCat extends Cat{
	
	private String favOwner;

	//Overloading makeSound
	public void makeSound(String sound) {
		System.out.println(sound);
		//System.out.println("Miayeeeaww!");
		
		
	}
	
	@Override
	public void makeSound() {
		
		System.out.println("Miyaoeeww!");
		
		
	}
	
	
	public HouseCat(int numberOfLegs, String habitat, String favFood, String favOwner) {
		super(numberOfLegs, habitat, favFood);
		this.favOwner = favOwner;
		System.out.println("Housecat constructor");
	}

	public String getFavOwner() {
		return favOwner;
	}

	public void setFavOwner(String favOwner) {
		this.favOwner = favOwner;
	}
	
	
	
	
	

}
