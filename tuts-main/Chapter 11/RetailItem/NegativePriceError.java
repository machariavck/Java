

public class NegativePriceError extends Exception {

	public NegativePriceError() {
		super("A negative price doesn't exist!");
	}

	public NegativePriceError(double d) {
		super(String.format("Error! KES %,.2f is a negative price!", d));
	}
}