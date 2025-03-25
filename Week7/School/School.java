public class School{
	private String schoolName;
        private String address;
        private Principal principal;
        private ClassRoom classes[] = new ClassRoom[2];

        public School(String schoolName, String address, Principal principal) {
        	this.schoolName = schoolName;
        	this.address = address;
        	this.principal = principal;
        }

	public void setSchoolName(String nSchoolName){
		schoolName = nSchoolName;
	}
	
	public void setAddress(String nAddress){
		address = nAddress;
	}

	public void setClasses(ClassRoom[] nClasses){
		classes = nClasses;
	}

	public String getSchoolName(){
		return schoolName;
	}

	public String getAddress(){
		return address;
	}

	public ClassRoom[] getClasses() {
		return classes;
	}

}