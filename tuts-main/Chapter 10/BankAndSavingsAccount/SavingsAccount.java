
public class SavingsAccount extends BankAccount {

	private boolean status;

	public SavingsAccount(double bal, double rate) {
		super(bal, rate);
		status = bal < 25 ? false : true;
	}

	@Override
	public void withdraw(double w) {
		if (getBalance() < 25) {
			System.out.println("*Can't withdraw, balance is too low* (Balance: $" + getBalance() + ")");
			status = false;
		}
		if (status)
			super.withdraw(w);
	}

	@Override
	public void deposit(double d) {
		if (!status && (d + getBalance()) > 25)
			status = true;
		super.deposit(d);
	}

	@Override
	public void monthlyProcess() {
		if (getNumberOfWithdrawals() > 4) {
			for (int i = 5; i <= getNumberOfWithdrawals(); i++)
				updateServiceCharge(1);
		}
		super.monthlyProcess();
		if (getBalance() < 25) status = false;
	}

	@Override
	public String toString() {
		return super.toString() + "Status: " + (status ? "active" : "inactive");
	}
}