import java.util.Scanner;

public class CarpetCalculator {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a room's length in feet: ");
		double l = sc.nextDouble();
		System.out.println("Enter the room's width in feet: ");
		double w = sc.nextDouble();
		RoomDimension rm = new RoomDimension(l, w);
		System.out.println("Enter the price per square foot of the carpet you desire: ");
		double p = sc.nextDouble();
		RoomCarpet rc = new RoomCarpet(rm, p);
		System.out.println("\n" + rm + "\n\n" + rc + "\n");
	}
}