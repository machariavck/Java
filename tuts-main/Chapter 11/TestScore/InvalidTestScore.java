
public class InvalidTestScore extends Exception {

	int value;

	public InvalidTestScore(int t) {
		super("Error! " + t + " is an invalid test score. It has been removed.");
		value = t;
	}

	public int getValue() {
		return value;
	}
}