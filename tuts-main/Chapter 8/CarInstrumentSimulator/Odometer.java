
public class Odometer {

	private int mileage;
	private FuelGauge gauge;
	private int count = 0;

	public Odometer(FuelGauge gg, int m) {
		gauge = gg;
		mileage = m;
	}
	public Odometer(FuelGauge ga) {
		this(ga, 0);
	}
	public Odometer(Odometer od) {
		gauge = od.gauge;
		mileage = od.mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void incrementMileage() {
		count++;
		if (count == 24) {
			count = 0;
			gauge.burnFuel();
		}
		if (mileage < 999999)
			mileage++;
		else
			mileage = 0;
	}

	public String toString() {
		return String.format("\nMILEAGE (in miles): %06d", mileage);
	}
}