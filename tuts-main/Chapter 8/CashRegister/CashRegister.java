
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
		return 0.06 * this.getSubtotal();
	}

	public double getTotal() {
		return this.getTax() + this.getSubtotal();
	}

	public String toString() {
		return item + String.format("Quantity: %21d\nSubtotal: %,21.2f\nTax: %,26.2f\nTotal: %,24.2f\n", quantity, this.getSubtotal(), this.getTax(), this.getTotal());
	}
}