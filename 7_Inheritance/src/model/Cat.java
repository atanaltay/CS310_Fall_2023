package model;

public class Cat extends Animal{
	
	private String favFood;

	
	
	
	
	public Cat(int numberOfLegs, String habitat, String favFood) {
		super(numberOfLegs, habitat);
		this.favFood = favFood;
		System.out.println("Cat constructor");
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	
	
	
	

}
