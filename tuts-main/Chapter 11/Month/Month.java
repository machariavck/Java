
public class Month {

	private int monthNumber;
	private String[] monthName = { "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december" };

	public Month() {
		monthNumber = 0;
	}

	public Month(int m) throws IncorrectMonthNumber {
		setMonthNumber(m);
	}

	public Month(String g) throws IncorrectMonthName {
		for (int i = 1; i < 13; i++) {
			if (g.toLowerCase().equals(monthName[i - 1])) {
				monthNumber = i;
				return;
			}
		}
		throw new IncorrectMonthName(g);
	}

	public void setMonthNumber(int m) throws IncorrectMonthNumber {
		if (m < 1 || m > 12)
			throw new IncorrectMonthNumber(m);
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
		return (monthNumber == m.monthNumber);
	}

	public boolean greaterThan(Month m) {
		return (monthNumber > m.monthNumber);
	}

	public boolean lessThan(Month m) {
		return (monthNumber < m.monthNumber);
	}
}
