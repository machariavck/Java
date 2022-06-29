
public class Month {

	private int monthNumber;
	private String[] monthName = { "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december" };
	
	public Month() {
		monthNumber = 1;
	}
	public Month(int m) {
		if (m < 1 || m > 12)
			monthNumber = 1;
		else
			monthNumber = m;
	}
	public Month(String g) {
		boolean n = true;
		int i = 0;
		while ( n && i < 12 ) {
			if (g.toLowerCase().equals(monthName[i])) {
				n = false;
				monthNumber = i + 1;
			}
			i++;
		}
	}

	public void setMonthNumber(int m) {
		if (m < 1 || m > 12)
			monthNumber = 1;
		else
			monthNumber = m;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public String getMonthName() {
		return monthName[monthNumber - 1].toUpperCase();
	}

	public String toString() {
		return this.getMonthName();
	}

	public boolean equals(Month m) {
		boolean b = false;
		if (monthNumber == m.monthNumber)
			b = true;
		return b;
	}

	public boolean greaterThan(Month m) {
		boolean b = false;
		if (monthNumber > m.monthNumber)
			b = true;
		return b;
	}

	public boolean lessThan(Month m) {
		boolean b = false;
		if (monthNumber < m.monthNumber)
			b = true;
		return b;
	}
}