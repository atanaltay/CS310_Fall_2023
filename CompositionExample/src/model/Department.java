package model;

public class Department {
	
	private String name;
	private Employee[] employees;
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Department(String name, Employee[] employees) {
		super();
		this.name = name;
		this.employees = employees;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee[] getEmployees() {
		return employees;
	}


	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	

}
