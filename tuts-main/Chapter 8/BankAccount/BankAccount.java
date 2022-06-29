
public class BankAccount {
	
	private float balance;

	/**Constructors*/
	public BankAccount() {
		balance = 0;
	}
	public BankAccount(float bal) {
		balance = bal;
	}
	public BankAccount(String bal) {
		balance = Float.parseFloat(bal);
	}
	public BankAccount(BankAccount ba) {
		balance = ba.balance;
	}

	/**Deposit Methods*/
	public void deposit(float bal) {
		balance += bal;
	}
	public void deposit(String bal) {
		balance += Float.parseFloat(bal);
	}
	
	/**Withdraw Methods*/
	public void withdraw(float bal) {
		balance -= bal;
	}
	public void withdraw(String bal) {
		balance -= Float.parseFloat(bal);
	}
	
	/**Balance accesssor method*/
	public float getBalance() {
		return balance;
	}

	public String toString() {
		return String.format("\nBalance: KES %,.2f\n", this.balance);
	}

	public void finalize() {
		System.out.println("It's over");
	}
}