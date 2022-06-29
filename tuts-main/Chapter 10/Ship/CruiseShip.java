
public class CruiseShip extends Ship {

	private int max_passengers;

	public CruiseShip(String n, String y, int m) {
		super(n, y);
		max_passengers = m;
	}

	public void setMaxPassengers(int m) {
		max_passengers = m;
	}

	public int getMaxPassengers() {
		return max_passengers;
	}

	@Override
	public String toString() {
		return "\nCruise Ship Name: " + getName() + "\nMaximum Passengers: " + max_passengers;
	}
}