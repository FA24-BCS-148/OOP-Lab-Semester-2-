public class Person{
	private String name;
	private String role;
	private Address address;

	public Person(String name, String role, Address address){
		this.name = name;
		this.role = role;
		this.address = address;
	}
	
	public Person(Person other){
		this.name = other.name;
		this.role = other.role;
		this.address = other.address;
	}

	public void showPersonDetail(){
		System.out.printf("Name: %s, \nRole: %s", name , role);
	}

	public String getName(){
		return name;
	}
	
	public String getRole(){
		return role;
	}

	public void setName(String newName){
		name = newName;
	}

	public void setRole(String newRole){
		role = newRole;
	}
}