package model;

//JavaBean
public class Employee {
	
	private String nameLastName;
	private int startYear;
	private double currentSalary;
	
	//Composition
	private Address address;
	
	
	public Employee() {
		
	}



	public Employee(String nameLastName, int startYear, double currentSalary) {
		this.nameLastName = nameLastName;
		this.startYear = startYear;
		this.currentSalary = currentSalary;
	}

	


	public Employee(String nameLastName, int startYear, double currentSalary, Address address) {
		super();
		this.nameLastName = nameLastName;
		this.startYear = startYear;
		this.currentSalary = currentSalary;
		this.address = address;
	}



	public String getNameLastName() {
		return nameLastName;
	}



	public void setNameLastName(String nameLastName) {
		this.nameLastName = nameLastName;
	}



	public int getStartYear() {
		return startYear;
	}



	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}



	public double getCurrentSalary() {
		return currentSalary;
	}



	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}
		
	

}
