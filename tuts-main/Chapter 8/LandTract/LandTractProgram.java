import java.util.*;

public class LandTractProgram {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the first tract of land length: ");
		double l = sc.nextDouble();
		System.out.print("Enter its width: ");
		double w = sc.nextDouble();
		LandTract land1 = new LandTract(l, w);
		System.out.print("\nEnter the second tract of land length: ");
		l = sc.nextDouble();
		System.out.print("Enter its width: ");
		w = sc.nextDouble();
		LandTract land2 = new LandTract(l, w);
		System.out.println("\n\nLand 1 " + land1);
		System.out.println("Land 2 " + land2);
		if (land1.equals(land2))
			System.out.println("They have the same dimensions");
		else
			System.out.println("They have different dimensions");
	}
}