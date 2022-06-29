
public class Stocks {

	private String symbol;
	private double sharePrice;

	public Stocks(String symbol, double sharePrice) {
		this.symbol = symbol;
		this.sharePrice = sharePrice;
	}

	public Stocks(String symbol) {
		this(symbol, 0.0);
	}

	public Stocks(Stocks ob) {
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
		return "Trading Symbol: " + symbol + "\nShare Price: KES " + sharePrice;
	}

	public boolean equals(Stocks ob) {
		boolean status = false;
		if (this.symbol.equals(ob.symbol) && this.sharePrice == ob.sharePrice)
			status = true;
		return status;
	}

	public Stocks copy() {
		Stocks copyObject = new Stocks(symbol, sharePrice);
		return copyObject;
	}
}