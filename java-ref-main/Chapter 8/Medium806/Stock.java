
public class Stock {

	private String symbol;
	private double sharePrice;

	public Stock(String sym, double price) {
		symbol = sym;
		sharePrice = price;
	}

	public Stock(Stock ob) {
		symbol = ob.symbol;
		sharePrice = ob.sharePrice;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public String toString() {
		return "Trading Symbol: " + symbol + "\nShare Price: " + sharePrice;
	}

	public boolean equals(Stock ob2) {
		boolean status = false;
		if (symbol.equals(ob2.symbol) && sharePrice == ob2.sharePrice)
			status = true;
		return status;
	}

	public Stock copy() {
		Stock copyObject = new Stock(symbol, sharePrice);
		return copyObject;
	}
}
