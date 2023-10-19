package collectionsexamples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<>();
		
		names.add("jack");
		names.add("john");
		names.add("william");
		names.add("henry");
		
		System.out.println(names.get(0));
		System.out.println("-------------");
		names.remove(0);
		
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		System.out.println("-------------");
		Product prod1 = new Product(1,"laptop",2000);
		Product prod2 = new Product(2,"TV",5000);
		
		List<Product> products = new ArrayList<>();
		products.add(prod1);
		products.add(prod2);
		
		
		for (Product product : products) {
			System.out.println(product);
		}
		
		
	}
	
	
	
}
