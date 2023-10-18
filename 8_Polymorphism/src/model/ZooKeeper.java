package model;

public class ZooKeeper {

	
	public void feedAnimals(Animal[] animals) {
		
		for (Animal animal : animals) {
			animal.getFed();
		}
		
		
	}
	

	
}
