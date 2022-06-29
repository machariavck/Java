
public class InvalidEmployeeNumber extends Exception {

	public InvalidEmployeeNumber() {
		super("Invalid employee number provided. The correct format is \"STE-AAA-21\" where A can be a letter or digit and dashes shouldn't be there");
	}
}