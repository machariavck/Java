public class MonthDays {

	private int numberOfDays;
	private int month;
	private int year;

	public MonthDays(int mn, int yr) {
		month = mn;
		year = yr;
	}

	public int getNumberOfDays() {
		if (month == 2) {
			if ( ((year % 100 == 0) && (year % 400 == 0)) || !(year % 100 == 0) && (year % 4 == 0))
				numberOfDays = 29;
			else
				numberOfDays = 28;
		} else if (month == 11 || month == 9 || month == 4 || month == 6) {
			numberOfDays = 30;
		} else {
			numberOfDays = 31;
		}
		return numberOfDays;
	}
}
					