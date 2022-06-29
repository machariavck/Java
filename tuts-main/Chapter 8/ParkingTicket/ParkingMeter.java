
public class ParkingMeter {

	private int minutesPurchased;

	public ParkingMeter(int m) {
		minutesPurchased = m;
	}
	public ParkingMeter() {
		this(200);
	}
	public ParkingMeter(ParkingMeter m) {
		minutesPurchased = m.minutesPurchased;
	}

	public int getMinutesPurchased() {
		return minutesPurchased;
	}

	public String toString() {
		return String.format("\nMinutes Purchased: %d\n", minutesPurchased);
	}
}