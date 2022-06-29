public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String d, int u, double p) {
		description = d;
		unitsOnHand = u;
		price = p;
	}
	public RetailItem(RetailItem d) {
		description = d.description;
		unitsOnHand = d.unitsOnHand;
		price = d.price;
	}

	public void setDescription(String d) {
		description = d;
	}
	
	public void setUnitsOnHand(int u) {
		unitsOnHand = u;
	}
	
	public void setPrice(double p) {
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
		String g = "KES";
		return String.format("Item: %s\n===============================\nDetails%24s\n===============================\nUnits in Stock: %15d\nPrice: %,24.2f\n", description, g, unitsOnHand, price);
	}
}
	