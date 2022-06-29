
import java.util.Scanner;
import java.util.Random;

public class PenniesForPay {
	public static void main(String[] sth) {
		float pennies = 1.0f;
		float totalPennies = 0;
		Scanner userIn = new Scanner(System.in);
		System.out.println("Hello. For how many days did you work?");
		int days = userIn.nextInt();
		while (days < 1) {
			System.out.println("Invalid number. Please provide the number of days worked again.");
			days = userIn.nextInt();
		}
		System.out.printf("Lemme generate your pay for %d number of days\n", days);
		System.out.printf("\t\tDay\t\t\tCumulative Salary (In Dollars)\n");
		for (int x = 1; x <= days; x++) {
			System.out.printf("\t\t%d\t\t\t%,8.1f$\n", x, pennies);
			totalPennies += pennies;
			pennies *= 2;
		}
		System.out.printf("\n\ttotal \t%d\t\t\t%,8.1f$\n", days, totalPennies);
	}
}
