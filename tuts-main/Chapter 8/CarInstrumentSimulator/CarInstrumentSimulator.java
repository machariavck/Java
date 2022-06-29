import java.util.*;


public class CarInstrumentSimulator {

	public static void main(String[] sth) {

		FuelGauge fuelGauge = new FuelGauge();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to the Car Instrument Simulator. Press enter to continue...");
		sc.nextLine();
		System.out.print("Enter some fuel we refill the car first. How many gallons are you putting? ");
		int f = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < f; i++)
			fuelGauge.unitRefueling();
		System.out.println("\nYour fuel tanks reads this: \n\n" + fuelGauge + "\n\nPress enter to start travelling...");
		sc.nextLine();
		Odometer odometer = new Odometer(fuelGauge);
		System.out.print("\nHow many miles have you travelled so far? ");
		f = sc.nextInt();
		System.out.println();
		for (int i = 0; i < f; i++)
			odometer.incrementMileage();
		System.out.println(odometer);
		System.out.println(fuelGauge);
	}
}