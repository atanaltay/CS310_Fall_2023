package generics;

public class TypeBox<T> {
	
	private T variable1;
	
	
	public T getVariable1() {
		return variable1;
	}
	
	public void setVariable1(T variable1) {
		this.variable1 = variable1;
	}
	
	public String getTypeInfo() {
		
		return variable1.getClass().toString();
		
		
	}
	

}
