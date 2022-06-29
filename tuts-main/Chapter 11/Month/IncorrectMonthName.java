
public class IncorrectMonthName extends Exception {

	public IncorrectMonthName(String g) {
		super(g + " is an incorrect month name");
	}
}