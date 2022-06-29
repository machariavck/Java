
public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String d, int u, double p) throws NegativePriceError, NegativeUnitsError {
		description = d;
		setUnitsOnHand(u);
		setPrice(p);
	}

	public RetailItem() throws NegativePriceError, NegativeUnitsError {
		this("", 0, 0);
	}

	public void setDescription(String d) {
		description = d;
	}

	public void setUnitsOnHand(int u) throws NegativeUnitsError {
		if (u < 0)
			throw new NegativeUnitsError();
		unitsOnHand = u;
	}
	
	public void setPrice(double p) throws NegativePriceError {
		if (p < 0)
			throw new NegativePriceError(p);
		price = p;
	}

	public String getDescription() {
		return description;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return String.format("\nItem Description: %s\nUnits Present: %d\nUnit Price: KES %,.2f\n", description, unitsOnHand, price);
	}
}