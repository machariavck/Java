
public class InvalidShift extends Exception {

	public InvalidShift() {
		super("Invalid shift value provided. Shift can either be 1 or 2 only.");
	}
}