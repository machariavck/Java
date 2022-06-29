import java.util.*;

public class runAccountProgram {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nHola! Welcome to KUR:A LLC!!\n\nPress enter to continue..");
		sc.nextLine();
		System.out.print("So, which bank would you like to go with? Enter their interest rate to proceed: ");
		double r = sc.nextDouble();
		System.out.print("\nHow much cash (in dollars) are you going to deposit to open your account with? ");
		double b = sc.nextDouble();
		BankAccount ba = new SavingsAccount(b, r);
		//after a while, doing a review of the current bank status
		System.out.println("Welcome to ABSA bank. Here's the current status of your account;" + ba);
		System.out.printf("\nLet's start by running all the deposits. Enter -1 when done.\nDeposit (Current Balance: $%.2f): $", ba.getBalance());
		double dep = sc.nextDouble();
		while (dep != -1) {
			ba.deposit(dep);
			System.out.printf("Deposit (Current Balance: $%.2f): $", ba.getBalance());
			dep = sc.nextDouble();
		}
		System.out.printf("\nNow, let's run the withdrawals. Enter -1 when done.\nWithdraw (Current Balance: $%.2f): $", ba.getBalance());
		double w = sc.nextDouble();
		while (w != -1 ) {
			if (w > ba.getBalance())
				System.out.println("That amount is greater than your balance. Try again.");
			else
				ba.withdraw(w);
			System.out.printf("Withdraw (Current Balance: $%.2f): $", ba.getBalance());
			w = sc.nextDouble();
		}
		ba.monthlyProcess();
		sc.nextLine();
		System.out.print("\nSo, let's see how the bank account looks now..");
		sc.nextLine();
		System.out.println(ba);
	}
}
		