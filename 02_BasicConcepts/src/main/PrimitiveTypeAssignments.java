package main;

public class PrimitiveTypeAssignments {

	public static void main(String[] args) {
		
		
		int x1 = 10;	
		int x2 = x1;
		x1+=10;
		
		//formatting operators
		//%d -> int
		//%s -> String
		//%f -> float, double
		
		System.out.printf("x1 is %d\n",x1);
		System.out.printf("x2 is %d\n",x2);
		
		String s1 = "Java rules";
		String s2 = s1;
		
		
		s1 = "Marry Jane";
		
		System.out.printf("s1 : %s\n",s1);
		System.out.printf("s2 : %s\n",s2);
		
	}
	
	
	
}
