package main;


public class EqualityTester {

	
	public static void main(String[] args) {
		Product prod1 = new Product(1,"laptop",2000);
		Product prod2 = new Product(1,"laptop",2000);
		/*
		
		
		Product prod3 = new Product(3,"TV",2000);
		Product prod4 = new Product(5,"shoes",2000);
		
		if(prod1 == prod2) {
			System.out.println("EQUAL");
		}else System.out.println("NOT EQUAL");
		
		
		if(prod1.equals(prod2)) {
			System.out.println("EQUAL");
		}else System.out.println("NOT EQUAL");
		
		*/
		
		
		String s1 = "Java rules!";
		
		String s2 = "Java rules!";
		

		
		if (s1==s2) {
			System.out.println("EQUAL");
		}		
		
		
		String s3 = "Java ";
		String s4 = "rules!";
		String s5 = s3+s4;
		
		if(s1==s5) {
			System.out.println("EQUAL");
		}else System.out.println("NOT EQUAL");
		
		System.out.println("-------------");
		if(s1.equals(s5)) {
			System.out.println("EQUAL");
		}else System.out.println("NOT EQUAL");
		
		
		System.out.println("------------");
		
		
		if(prod1.equals(prod2)) {
			System.out.println("EQUAL");
		}else System.out.println("NOT EQUAL");
		
	}
	
}
