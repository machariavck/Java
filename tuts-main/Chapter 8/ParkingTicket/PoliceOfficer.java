
public class PoliceOfficer {

	private String officerName;
	private String badgeNumber;

	public PoliceOfficer(String o, String b) {
		officerName = o;
		badgeNumber = b;
	}

	public PoliceOfficer(PoliceOfficer fed) {
		officerName = fed.officerName;
		badgeNumber = fed.badgeNumber;
	}

	public boolean checkExpired(ParkedCar c, ParkingMeter t) {
		boolean expired = false;
		if (c.getMinutesParked() > t.getMinutesPurchased())
			expired = true;
		return expired;
	}

	public ParkingTicket issueTicket(ParkedCar c, ParkingMeter m) {
		return new ParkingTicket(c, m, this);
	}

	public String toString() {
		return "\nOfficer Name: " + officerName + "\nBadge Number: " + badgeNumber;
	}
}