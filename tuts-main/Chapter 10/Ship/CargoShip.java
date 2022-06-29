
public class CargoShip extends Ship {

	private int capacity;

	public CargoShip(String n, String y, int c) {
		super(n, y);
		capacity = c;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int c) {
		capacity = c;
	}

	@Override
	public String toString() {
		return "\nCargo Ship Name: " + getName() + "\nCargo Capacity: " + capacity + " tonnes";
	}
}