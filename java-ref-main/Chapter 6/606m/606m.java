/*	Chapter 6.6 Overloading Methods and Constructors

	--> two or more methods in a class may have the same name as long as their parameter lists are different; this also applies to constructors
	--> when a method is overloaded, multiple methods in the same class have the same name but use different types of parameters
	--> a compiler must determine which one among overloaded methods the programmer intended to call when they write a call to the method
	--> matching a method call with the correct method is known as binding
	--> when an overloaded method is being called, Java uses the method's name and parameter list to determine which method to bind the call to
	--> Java uses a method's signature to distinguish it from other methods of the same name
	--> a method's signature consists of the method's name and the data types of the method's parameters, in the order that they appear
	***A method's return type is not part of the signature
	--> the rules for overloading constructors are the same for overloading other methods
	--> overloading methods make the class more flexible thus more useful

*/

import javax.swing.JOptionPane;

public class Medium606 {

	public static void main(String[] nu) {
		String input = JOptionPane.showInputDialog("Hello. How much were you paid this month?");
		BankAccount account = new BankAccount(input);
		input = JOptionPane.showInputDialog(String.format("Your balance is now $%,.2f. And how much will you deposit?", account.getBalance()));
		account.deposit(input);
		input = JOptionPane.showInputDialog(String.format("Your balance is $%,.2f. Now how much will you withdraw?", account.getBalance()));
		account.withdraw(input);
		JOptionPane.showMessageDialog(null, String.format("Your balance is $%,.2f. Bye", account.getBalance()));
		System.exit(0);
	}
}
