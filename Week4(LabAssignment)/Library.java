class Library{
	private String name;
	private Book book;
	private Person incharge;
	private Person staff;

	public Library(String name, Book book, Person incharge, Person staff){
		this.name = name;
		this.book = book;
		this.incharge = incharge;
		this.staff = staff;
	}

	public Library(Library other){
		this.name = other.name;
		this.book = other.book;
		this.incharge = other.incharge;
		this.staff = other.staff;
	}

	void showLibraryDetails(){
		System.out.printf("Library Name: ", name);
	}

	public String getName(){
		return name;
	}

	public void setName(String newName){
		name = newName;
	}
}