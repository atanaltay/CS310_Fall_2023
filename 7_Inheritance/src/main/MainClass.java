package main;

import model.Animal;
import model.HouseCat;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		//Constructors are chained from Animal to HouseCat
		HouseCat houseCat = new HouseCat(4,"house","chicken","jack");
		
		houseCat.setFavFood("chicken");
		
		System.out.println(houseCat.getFavFood());
		System.out.println(houseCat.getFavOwner());
		
		
		Animal animal = new Animal(4, null);
	
		
		HouseCat myCat = new HouseCat(4, "", "", "");
		
		
		animal.makeSound();
		
		myCat.makeSound();
		
	
		
		
	}
	
	
	
}
