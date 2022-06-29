
public class FuelGauge {

	private int fuel;

	public FuelGauge(int f) {
		fuel = f;
	}
	public FuelGauge(FuelGauge fg) {
		fuel = fg.fuel;
	}
	public FuelGauge() {
		this(0);
	}

	public int getFuel() {
		return fuel;
	}

	public void unitRefueling() {
		if (fuel < 15)
			fuel++;
	}

	public void burnFuel() {
		if (fuel > 0)
			--fuel;
	}

	public String toString() {
		return String.format("FUEL (in gallons): %02d", fuel);
	}
}