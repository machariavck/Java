public class SavingsAccount {

	private float balance;
	private float annualRate;

	public SavingsAccount(float b) {
		balance = b;
		annualRate = 0;
	}

	public SavingsAccount(String b) {
		balance = Float.parseFloat(b);
		annualRate = 0;
	}

	public void setAnnualRate(String r) {
		annualRate = Float.parseFloat(r);
	}

	public void setAnnualRate(float r) {
		annualRate = r;
	}

	public void withdraw(float b) {
		balance -= b;
	}

	public void withdraw(String r) {
		balance -= Float.parseFloat(r);
	}

	public void deposit(float b) {
		balance += b;
	}

	public void deposit(String r) {
		balance += Float.parseFloat(r);
	}

	public float monthlyInterest() {
		return (annualRate / 12) * balance;
	}

	public void addInterest() {
		balance += monthlyInterest();
	}

	public float getBalance() {
		return balance;
	}
}