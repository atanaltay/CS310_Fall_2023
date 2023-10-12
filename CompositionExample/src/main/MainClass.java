package main;

import model.Address;
import model.Department;
import model.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		Address add1 = new Address("bagdat", "istanbul", 12);
		
		Employee emp = new Employee("altug tanaltay", 2008, 1000, add1);
		
		
		System.out.println("Employee is : " + emp.getNameLastName());
		System.out.println("Employee's address is (city): " 
								+ emp.getAddress().getCity());
		
		System.out.println("Employee's address is (street): " 
				+ emp.getAddress().getStreet());
		
		
		
		Address add2 = new Address("bagdat", "istanbul", 30);
		
		Employee emp2 = new Employee("mehmet tanaltay", 2010, 1000, add2);
		
		
		Department department = new Department("IT", 
				new Employee[]{emp,emp2});
		
		
		
	System.out.println("Department:" + department.getName());
	
	System.out.println("Employees are");
	
	Employee[] emps = department.getEmployees();
	
	for (Employee employee : emps) {
		System.out.println(employee.getNameLastName());
	}
	
	
	}
	
	
	
	
	
}
