public class Date{

	private int month;
	private int year;
	private int day;



private static final int[] daysOfMonth =
 {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


public Date(int month, int year, int day){

	if(year == 0 || year < 0 ){
		throw new IllegalArgumentException("year out of range");
	}

	if(day < 0 || (day > daysOfMonth[month] && !(month == 2 && day == 29 ))){
		throw new IllegalArgumentException("month is out of range");
	}


	if(month == 2  && day == 29  && (year % 4 == 0 && year % 100 != 0)){
			throw new IllegalArgumentException("day is out of range");

		}


	this.month = month;
	this.year = year;
	this.day = day;
}


public String toString(){
	return String.format("%d %d %d", day, month, year);

}

}