public class Lab{
	private String name;
	private Employe labStaff;
	private Computers[] labSystems = new Computers[49];
	
	public Lab(String name, Employe labStaff, Computers labSystems[]){
		this.name = name;
		this.labStaff = labStaff;
		this.labSystems = labSystems;
	}
	
	public boolean hasMultiMedia(int choice){
		if (choice == 0){
			return false;
		}
		else {
			return true;
		}
	}
	
	
}