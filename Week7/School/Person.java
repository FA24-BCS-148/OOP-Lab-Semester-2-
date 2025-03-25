public class Person{
	private String name;
	private int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setName(String nName){
		name = nName;
	}

	public void setAge(int nAge){
		age = nAge;
	}
}