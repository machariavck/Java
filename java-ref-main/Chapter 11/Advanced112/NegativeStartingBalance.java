
public class NegativeStartingBalance extends Exception {

	public NegativeStartingBalance() {
		super("Error: Negative starting balance!");
	}

	public NegativeStartingBalance(double d) {
		super("Error: Negative starting balance: " + d);
	}
}