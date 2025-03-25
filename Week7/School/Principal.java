public class Principal extends Person{
	private int experience;
	public Principal(String name, int age, int experience){
		super(name, age);
		this.experience = experience;

	}
	
	public void setExperience(int nExp){
		experience = nExp;
	}

	public int getExperience(){
		return experience;
	}
}