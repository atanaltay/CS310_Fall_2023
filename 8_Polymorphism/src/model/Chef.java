package model;

public class Chef {
	
	public void cookAnimals(Animal[] anims) {
		
		for (Animal animal : anims) {
			if(animal instanceof Eatable) {
				((Eatable)animal).howToEat();
			}else  System.out.println("animal cannot be eaten");
			
		}
		
		
	}

}
