/**
	SportsCar class
*/

public class SportsCar {

	private CarType make;
	private CarColor color;
	private double price;

	public SportsCar(CarType m, CarColor c, double p) {
		make = m;
		color = c;
		price = p;
	}

	public CarType getMake() {
		return make;
	}

	public CarColor getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return String.format("Make: %s\nColor: %s\nPrice: KES %,.2f", make, color, price);
	}
}