import java.util.Scanner;

public class CarProgram {
	
	public static void main(String[] sth) {
		System.out.println("Welcome to the car program version 1.0");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nWhich car do you want to drive?\t");
		String carMake = sc.nextLine();
		System.out.print("\nWhich model?\t");
		int carModel = sc.nextInt();
		sc.nextLine();
		System.out.println("\nYour test drive can begin! Press enter to continue..");
		sc.nextLine();
		Car car1 = new Car(carModel, carMake);
		for (int x = 1; x <= 5; x++) {
			car1.accelerate();
			System.out.println("Your are now driving at " + car1.getSpeed() + " km/h.");
		}
		System.out.println("\nNow let's start braking..press enter to continue...");
		sc.nextLine();
		for (int x = 1; x <= 5; x++) {
			car1.brake();
			System.out.println("Your are now driving at " + car1.getSpeed() + " km/h.");
		}
		System.out.print("\nPress anything to quit...");
		sc.nextLine();
	}
}