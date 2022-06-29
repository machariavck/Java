
public class InvalidValue extends Exception {

	public InvalidValue(int t) {
		super(t + " is an invalid value!");
	}
}