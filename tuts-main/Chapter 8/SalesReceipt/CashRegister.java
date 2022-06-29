
public class CashRegister {

	private RetailItem item;
	private int quantity;

	public CashRegister(RetailItem i, int n) {
		item = new RetailItem(i);
		quantity = n;
	}

	public double getSubtotal() {
		return item.getPrice() * quantity;
	}

	public double getTax() {
		return 0.06 * getSubtotal();
	}

	public double getTotal() {
		return getTax() + getSubtotal();
	}

	public String toString() {
		return item + String.format("Quantity: %21d\nSubtotal: %,21.2f KES\nSales Tax: %,20.2f KES\nTotal: %,24.2f KES\n", quantity, getSubtotal(), getTax(), getTotal());
	}
}