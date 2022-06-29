
public class IncorrectMonthNumber extends Exception {

	public IncorrectMonthNumber(int t) {
		super(t + " is an incorrect month number");
	}
}