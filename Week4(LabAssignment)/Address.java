public class Address{
	private String street;
	private String city;

	public Address(String street, String city){
		this.street = street;
		this.city = city;
	}

	public void showAddress(){
		System.out.printf(city, ", ", street);
	}

	public Address(Address other){
		this.city = other.city;
		this.street = other.street;
	}
	
	public String getStreet(){
		return street;
	}

	public String getCity(){
		return city;
	}

	public void setStreet(String newStreet){
		street = newStreet;
	}

	public void setCity(String newCity){
		city = newCity;
	}
}