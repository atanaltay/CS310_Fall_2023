package main;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		int i1 = 100;
		
		double d1 = i1; //implicit cast
		
		
		System.out.println(d1);
		
		
		double d2 = 100.9;
		
		int i2 = (int)d2; //explicit cast
		
		System.out.println(i2);
		
		
		//String Conversions
		
		
		String ageInput = "32";

		
		//Wrapper types:
		//for all primitives we have a wrapper
		//object type
		//ie: int -> Integer
		//ie: double -> Double 
		//Float
		//Boolean
		
		int age = Integer.parseInt(ageInput);
		
		
		System.out.println((age + 10));
		
		double price = 123.23;
		
		String sPrice = String.valueOf(price);
		
		System.out.println(sPrice);
		
		//An important point
		//Any literal int sized or smaller
		//are always int
		byte b1 = 12;
		byte b2 = 23;
		
		//below there is a compiler error
		//byte bSum =b1 + b2;
		
		byte bSum = (byte)(b1 + b2);
		
		/*
		short s1 = 23;
		short s2 = 34;
		short sSum = s1 + s2;
		*/
		
	}
	
	
	
}
