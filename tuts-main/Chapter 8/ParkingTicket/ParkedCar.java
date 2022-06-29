
public class ParkedCar {

	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minutesParked;

	public ParkedCar(String make, String model, String color, String ln, int m) {
		this.make = make;
		this.model = model;
		this.color = color;
		licenseNumber = ln;
		minutesParked = m;
	}
	public ParkedCar(ParkedCar car) {
		make = car.make;
		model = car.model;
		color = car.color;
		licenseNumber = car.licenseNumber;
		minutesParked = car.minutesParked;
	}

	public int getMinutesParked() {
		return minutesParked;
	}

	public String toString() {
		return String.format("\nCAR DETAILS\nCar Make: %s\nCar Model: %s\nColor: %s\nLicense Number: %s\nMinutes Parked: %d", make, model, color, licenseNumber, minutesParked);
	}
}