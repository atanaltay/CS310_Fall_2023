package main;

import model.Animal;
import model.Cat;
import model.Chef;
import model.Chicken;
import model.Dog;
import model.HouseCat;
import model.Lion;
import model.ZooKeeper;

public class MainClass {

	
	public static void main(String[] args) {
		
		HouseCat houseCat = new HouseCat();
		
		//Animal represents all the subtypes
		// references from Animal can point 
		//any subtype of animal
		//housecat is an animal
		Animal houseCat2 = new HouseCat();
		
		Animal lion1 = new Lion();
	
		Cat lion2 = new Lion();
		
		Dog dog = new Dog();
		
		houseCat2.makeSound();
		lion1.makeSound();
		lion2.makeSound();
		
		//Output:
		//Miyaoeeww!
		//Roarrrr!!
		//Roarrrr!!

		Chicken chicken1 = new Chicken();
		
		Animal[] anims = new Animal[] {chicken1,
				houseCat2,lion1,lion2,dog
		};
		
		ZooKeeper zooKeeper = new ZooKeeper();
		zooKeeper.feedAnimals(anims);
		
		Chef mainChef = new Chef();
		
		mainChef.cookAnimals(anims);
		
		
	}
	
	
	
}
