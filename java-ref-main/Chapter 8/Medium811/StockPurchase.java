
public class StockPurchase {

	private Stocks stock;
	private int shares;

	public StockPurchase(Stocks stock, int shares) {
		this.stock = new Stocks(stock);
		this.shares = shares;
	}

	public int getShares() {
		return shares;
	}

	public Stocks getStock() {
		return new Stocks(stock);
	}

	public double getPurchaseCost() {
		return shares * stock.getSharePrice();
	}

	public String toString() {
		return String.format("%s\nShares: %d\nTotal Purchase Price: KES %,.2f", stock, shares, this.getPurchaseCost());
	}
}