public class Date{
	private int day;
	private int month;
	private int year;

	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	void showDate(){
		System.out.printf(day + "/" + month + "/" + year);
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public void setDay(int nday){
		day = nday;
	}

	public void setMonth(int nmonth){
		month = nmonth;
	}

	public void setYear(int nyear){
		year = nyear;
	}
}