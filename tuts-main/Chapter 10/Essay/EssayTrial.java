
import java.util.*;

public class EssayTrial {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter your essay scores respectively.");
		sc.nextLine();
		System.out.print("Grammar Points: ");
		int g = sc.nextInt();
		while (g > 30 || g < 0) {
			System.out.println("Grammar has a maximum of 30 points. Try again.");
			g = sc.nextInt();
		}
		System.out.print("Spelling Points: ");
		int s = sc.nextInt();
		while (s > 20 || s < 0) {
			System.out.println("Spelling has a maximum of 20 points. Try again.");
			s = sc.nextInt();
		}
		System.out.print("Correct Length Points: ");
		int cl = sc.nextInt();
		while (cl > 20 || cl < 0) {
			System.out.println("'Correct Length' has a maximum of 20 points. Try again.");
			cl = sc.nextInt();
		}
		System.out.print("Content Points: ");
		int c = sc.nextInt();
		while (c > 30 || c < 0) {
			System.out.println("Content has a maximum of 30 points. Try again.");
			c = sc.nextInt();
		}
		Essay ess = new Essay(g, s, cl, c);
		System.out.println("\nHere is the essay report: \n" + ess);
		sc.nextLine();
		sc.nextLine();
	}
}