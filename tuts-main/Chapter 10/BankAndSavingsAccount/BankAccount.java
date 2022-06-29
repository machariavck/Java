
public abstract class BankAccount {

	private double balance;
	private int numberOfDeposits;
	private int numberOfWithdrawals;
	private double annualInterestRate;
	private double monthlyServiceCharges;

	public BankAccount(double bal, double rate) {
		balance = bal;
		annualInterestRate = rate;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumberOfWithdrawals() {
		return numberOfWithdrawals;
	}

	public void updateServiceCharge(double s) {
		monthlyServiceCharges += s;
	}

	public void deposit(double dep) {
		balance += dep;
		numberOfDeposits++;
	}

	public void withdraw(double wit) {
		balance -= wit;
		numberOfWithdrawals++;
	}

	private void calcInterest() {
		balance += ((annualInterestRate / 12) * balance);
	}

	public void monthlyProcess() {
		balance -= monthlyServiceCharges;
		calcInterest();
		numberOfDeposits = 0;
		numberOfWithdrawals = 0;
		monthlyServiceCharges = 0;
	}

	public String toString() {
		return String.format("\nCurrent Balance: $%.2f\n", balance);
	}
}