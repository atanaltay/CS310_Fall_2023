package model;

public class HouseCat extends Cat{
	
	private String favOwner;

	
	public HouseCat() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Overloading makeSound
	public void makeSound(String sound) {
		System.out.println(sound);
		//System.out.println("Miayeeeaww!");
		
		
	}
	
	@Override
	public void getFed() {
		System.out.println("House cat is fed..");
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
