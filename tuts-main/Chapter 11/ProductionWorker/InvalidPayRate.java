
public class InvalidPayRate extends Exception {

	public InvalidPayRate() {
		super("Invalid pay rate provided. It should not be lesser than 20 or greater than 40");
	}
}