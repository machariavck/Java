
public class Customer extends Person {

	private String number;
	private boolean wish;

	public Customer(String n, String a, String t, String nu, boolean b) {
		super(n, a, t);
		number = nu;
		wish = b;
	}

	public Customer(String n, boolean b) {
		this("","","", n, b);
	}

	public Customer() {
		this("", false);
	}

	public void setNumber(String s) {
		number = s;
	}

	public void setWish(boolean b) {
		wish = b;
	}

	public String getNumber() {
		return number;
	}

	public boolean getWish() {
		return wish;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCustomer Number: " + number + "\nCustomer Preference: " + (wish ? "Would like to be on mailing list" : "Does not want to be on mailing list");
	}
}