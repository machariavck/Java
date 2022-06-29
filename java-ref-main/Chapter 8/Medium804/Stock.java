
public class Stock {

	private String symbol;
	private double sharePrice;

	public Stock(String sym, double price) {
		symbol = sym;
		sharePrice = price;
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
}