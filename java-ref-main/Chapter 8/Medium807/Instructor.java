
public class Instructor {

	private String lastName;
	private String firstName;
	private String officeNumber;

	public Instructor(String ln, String fn, String of) {
		lastName = ln;
		firstName = fn;
		officeNumber = of;
	}

	public Instructor(Instructor in) {
		lastName = in.lastName;
		firstName = in.firstName;
		officeNumber = in.officeNumber;
	}

	public void set(String ln, String fn, String of) {
		lastName = ln;
		firstName = fn;
		officeNumber = of;
	}

	public String toString() {
		return "Last Name: " + lastName + "\nFirst Name: " + firstName + "\nOffice Number: " + officeNumber;
	}
}