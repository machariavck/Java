
public class BankAccount1 {
	
	private float balance;

	/**Constructors*/
	public BankAccount1() {
		balance = 0;
	}
	public BankAccount1(float bal) {
		balance = bal;
	}
	public BankAccount1(String bal) {
		balance = Float.parseFloat(bal);
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

	public void finalize() {
		System.out.println("It's over");
	}
}