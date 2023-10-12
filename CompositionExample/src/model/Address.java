package model;

public class Address {

	private String street;
	private String city;
	private int no;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Address(String street, String city, int no) {
		super();
		this.street = street;
		this.city = city;
		this.no = no;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}
	
	
	
}
