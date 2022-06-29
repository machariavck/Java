/* Chapter 8.3 Returning Objects from Methods

	--> a method can return a reference to an object

*/

import javax.swing.*;

public class Medium803 {

	public static void main(String[] sth) {
		BankAccount account;
		account = getAccount();
		JOptionPane.showMessageDialog(null, "The account has a balance of KES" + account.getBalance());
		System.exit(0);
	}

	public static BankAccount getAccount() {
		String in = JOptionPane.showInputDialog("Enter the account balance");
		float balance = Float.parseFloat(in);
		return new BankAccount(balance);
	}
}
