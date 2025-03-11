public class Book{
	private String title;
	private String issn;
	private Date publicationDate;
	private Person author;

	public Book(String title, String issn, Date publicationDate, Person author){
		this.title = title;
		this.issn = issn;
		this.publicationDate = publicationDate;
		this.author = author;
	}

	public Book(Book other){
		this.title = other.title;
		this.issn = other.issn;
		this.publicationDate = other.publicationDate;
		this.author = other.author;
	}

	public void showBookDetails(){
		System.out.printf("Title: %s,\nISBN: %s", title, issn);
	}

	public String getTitle(){
		return title;
	}

	public String getISBN(){
		return issn;
	}

	public void setTitle(String nTitle){
		title = nTitle;
	}

	public void setISBN(String nissn){
		issn = nissn;
	}
}