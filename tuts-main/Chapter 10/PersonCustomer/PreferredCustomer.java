
public class PreferredCustomer extends Customer {

	private double purchases;
	private double discountLevel;

	public PreferredCustomer(String n, String a, String t, String nu, boolean b, double p) {
		super(n, a, t, nu, b);
		purchases = p;
		if (p >= 2000) discountLevel = 0.1;
		else if (p >= 1500) discountLevel = 0.07;
		else if (p >= 1000) discountLevel = 0.06;
		else if (p >= 500) discountLevel = 0.05;
		else discountLevel = 0;
	}

	public PreferredCustomer() {
		this("", "", "", "", false, 0);
	}

	public void setPurchases(double p) {
		purchases = p;
		if (p >= 2000) discountLevel = 0.1;
		else if (p >= 1500) discountLevel = 0.07;
		else if (p >= 1000) discountLevel = 0.06;
		else if (p >= 500) discountLevel = 0.05;
		else discountLevel = 0;
	}

	public double getDiscountLevel() {
		return discountLevel;
	}

	public double getPurchases() {
		return purchases;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTotal Purchases Made to date: KES " + purchases + "\nCurrent Discount: " + discountLevel * 100 + " %";
	}
}