
//package is the first declaration
package main;

//access modifier - class - class Name
public class Welcome {
	
	
	//main method is the entry point
	/*
	 * 
	 * multi line comment
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to CS310!!");
		
		//Primitive types
		//byte, short, int, long
		//char
		//boolean
		//float and double
		//variable in methods : local variables
		//all variable identifiers start with lower case letters
		int x = 23;
		int y = 34;
		
		short s1 = 23;
		
		char c1 = 'a';
		
		boolean isCheck = true;
		
		
		//String is not a primitive type, it is a reference type
		// but in some ways it acts like a primitive type
		String myName = "altug";
		
		System.out.println(myName);
		
		//Arithmetic operators (+, -, *, /)
		
		int sum = x+y;
		
		System.out.println("The sum is " + sum);
		
		
		String name1 = "altug";
		String lastName1 = "tanaltay";
		
		String fullName = name1 + " " + lastName1;
		
		System.out.println(fullName);
		
	}
	

}
