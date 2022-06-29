import java.util.Scanner;

public class MonthDaysProgram {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hi. I tell the number of days. Press enter to continue...");
		sc.nextLine();
		System.out.print("\n\nEnter a month (1 - 12): ");
		int m = sc.nextInt();
		while (m < 1 || m > 12) {
			System.out.print("\n\nIncorrect month. Try again!\nCorrected month value: ");
			m = sc.nextInt();
		}
		System.out.print("\n\nEnter a year: ");
		int y = sc.nextInt();
		MonthDays md = new MonthDays(m, y);
		System.out.printf("\n\n %d days", md.getNumberOfDays());
		System.exit(0);
	}
}