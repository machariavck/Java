import java.util.*;

public class ParkingTicketSimulator {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter the car details. First, car make: ");
		String make = sc.nextLine();
		System.out.print("Enter the car's model: ");
		String model = sc.nextLine();
		System.out.print("Enter the car's color: ");
		String color = sc.nextLine();
		System.out.print("Enter the car's license number: ");
		String ln = sc.nextLine();
		System.out.print("Enter the number of hours the car was parked: ");
		float hours = sc.nextFloat();
		sc.nextLine();
		ParkedCar car = new ParkedCar(make, model, color, ln, (int)(hours * 60));
		System.out.println("Here's the car details: \n" + car);
		sc.nextLine();
		System.out.print("How many hours was the car valid to park? ");
		hours = sc.nextFloat();
		sc.nextLine();
		ParkingMeter m = new ParkingMeter((int)(hours * 60));
		System.out.println("\nSo, the car was valid to park for:" + m + " minutes");
		sc.nextLine();
		PoliceOfficer fed = new PoliceOfficer("Pamela Puvy", "TRE-1-UK-12032A8");
		System.out.println("\nSIMULATION>>>>\n\nA few hours later...[press enter to continue]");
		sc.nextLine();
		System.out.println("[Officer Puvy]: Good evening sir. Here are my details:" + fed);
		sc.nextLine();
		System.out.println("Please let me have a look at your parking details...");
		sc.nextLine();

		//officer generates parking receipt if there is violation
		if (fed.checkExpired(car, m)) {
			ParkingTicket ticket = fed.issueTicket(car, m);
			System.out.print("Here's your ticket sir [press enter to accept]");
			sc.nextLine();
			System.out.println(ticket + "\n\nPay that amount before the end of the day sir..");
			sc.nextLine();
		}
		else {
			System.out.println("\nHave a good day sir");
			sc.nextLine();
		}
	}
}