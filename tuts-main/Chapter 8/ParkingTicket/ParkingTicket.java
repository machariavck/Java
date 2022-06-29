
public class ParkingTicket {

	private ParkedCar car;
	private ParkingMeter m;
	private PoliceOfficer d;

	public ParkingTicket(ParkedCar c, ParkingMeter m, PoliceOfficer d) {
		car = new ParkedCar(c);
		this.m = new ParkingMeter(m);
		this.d = new PoliceOfficer(d);
	}

	public ParkingTicket(ParkingTicket t) {
		car = new ParkedCar(t.car);
		m = new ParkingMeter(t.m);
		d = new PoliceOfficer(t.d);
	}

	public String reportFine() {
		int time = car.getMinutesParked() -  m.getMinutesPurchased() - 60;
		int fine = 25;
		while (time > 0) {
			time -= 60;
			fine += 10;
		}
		return String.format("\n\nTOTAL FINE PAYABLE: KES %.2f\n", fine * 109.66);
	}

	public String toString() {
		return car + reportFine() + d;
	}
}