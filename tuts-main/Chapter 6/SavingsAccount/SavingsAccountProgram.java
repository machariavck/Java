import java.util.*;
import javax.swing.*;

public class SavingsAccountProgram {

	public static void main(String[] sth) {
		System.out.println("\n\nWelcome to the Savings Account Program. Press enter to continue..");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String in = JOptionPane.showInputDialog("Starting balance?");
		SavingsAccount acc1 = new SavingsAccount(in);
		in = JOptionPane.showInputDialog("Annual Interest Rate?");
		acc1.setAnnualRate(in);
		String m = JOptionPane.showInputDialog("How many months?");
		for (int x = 1; x <= Integer.parseInt(m); x++) {
			String d = JOptionPane.showInputDialog("How much did you deposit in month " + x + "?");
			acc1.deposit(d);
			String w = JOptionPane.showInputDialog("How much did you withdraw in month " + x + "?");
			acc1.withdraw(w);
			acc1.addInterest();
			System.out.printf("\n\nThe ending balance: KES %,.2f\n", acc1.getBalance());
			System.out.printf("\nTotal deposits: KES %,.2f\n", Float.parseFloat(d));
			System.out.printf("\nTotal withdraws: KES %,.2f\n", Float.parseFloat(w));
			System.out.printf("\nTotal interest earned: KES %,.2f\n", acc1.monthlyInterest());
		}
	}
}