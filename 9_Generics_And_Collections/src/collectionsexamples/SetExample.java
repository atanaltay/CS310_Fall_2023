package collectionsexamples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		names.add("jack");
		names.add("william");
		names.add("henry");
		names.add("henry");
		names.add("john");
		names.add("henry");
		names.add("john");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		
		Product prod1 = new Product(1,"laptop",2000);
		Product prod2 = new Product(1,"laptop",2000);
		
		Product prod3 = new Product(3,"TV",2000);
		Product prod4 = new Product(5,"shoes",2000);
		
		Set<Product> prods = new HashSet<>();
		prods.add(prod1);
		prods.add(prod2);
		prods.add(prod3);
		prods.add(prod4);

		for (Product product : prods) {
			System.out.println(product);
		}
		
		
		
	}
	
	
	
}
