import java.io.Serializable;

public class BankAccount implements Serializable {

	private float balance;

	/**Constructors*/
	public BankAccount() {
		balance = 0;
	}
	/**This constructor sets the starting balance to the value passed as an argument.
		@param bal The starting balance.
		@exception NegativeStartingBalance When bal is negative.*/
	public BankAccount(float bal) throws NegativeStartingBalance {
		if (bal < 0)
			throw new NegativeStartingBalance(bal);
		balance = bal;
	}
	public BankAccount(String bal) throws NegativeStartingBalance {
		if (Float.parseFloat(bal) < 0)
			throw new NegativeStartingBalance(Float.parseFloat(bal));
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

	/**Balance mutator methods*/
	public void setBalance(float b) {
		balance = b;
	}
	public void setBalance(String b) {
		balance = Float.parseFloat(b);
	}
	/**Balance accesssor method*/
	public float getBalance() {
		return balance;
	}

	/**returns the balance*/
	public String toString() {
		return String.format("Balance: $%,.2f only", getBalance());
	}
}
