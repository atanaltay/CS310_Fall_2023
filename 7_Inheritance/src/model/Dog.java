package model;

public class Dog extends Animal{
	
	private String favToy;

	
	
	
	public Dog(int numberOfLegs, String habitat, String favToy) {
		super(numberOfLegs, habitat);
		this.favToy = favToy;
	}

	public String getFavToy() {
		return favToy;
	}

	public void setFavToy(String favToy) {
		this.favToy = favToy;
	}
	
	
	
	

}
