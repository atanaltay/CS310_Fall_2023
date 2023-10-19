package generics;

public class TypeBoxMain {
	
	
	public static void main(String[] args) {
		
		TypeBox<Integer> typeBoxInt = new TypeBox<>();
		
		typeBoxInt.setVariable1(100);

		System.out.println(typeBoxInt.getTypeInfo());
		
		
		TypeBox<String> typeBoxStr = new TypeBox<>();
		
		typeBoxStr.setVariable1("a name passed");
		
		System.out.println(typeBoxStr.getVariable1());
		System.out.println(typeBoxStr.getTypeInfo());
		
		TypeBox<Double> typeBoxDbl = new TypeBox<>();
		
		//TypeBox<double> typeBoxDbl = new TypeBox<>();
		
		//TypeBox<int> ttt = new TypeBox<>();
		
		
		
		
	}
	

}
