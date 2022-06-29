/*	Chapter 7.7 Arrays of Objects

	--> like any other data type, arrays of class objects can be created e.g. an array of BankAccount objects to represent all bank accounts owned by a person
			final int NUM_ACCOUNTS = 5;
			BankAccount[] client = new BankAccount[NUM_ACCOUNTS];		//from a BankAccount class
	--> client is the variable referencing the array; just like String arrays, each element in this array is a reference variable
	--> each element of the array is initialized with the value null, thus one has to individually create the objects that each element will reference i.e.
			for (int i = 0; i < client.length; i++)
				client[i] = new BankAccount();		//no-arg constructor
	--> objects in an array are accessed with subscripts, just like any other data type in an array i.e.
				client[2].setBalance(2500.0);

*/

import java.util.Scanner;

public class Medium707 {

	public static void main(String[] sth) {

		final int NUM_ACCOUNTS = 3;
		BankAccount[] client = new BankAccount[NUM_ACCOUNTS];

		createAccounts(client);
		System.out.println("Here are the balances for each account:");
		for (int i = 0; i < accounts.length; i++)
			System.out.printf("Account %d: KES %,.1f \n", (i + 1), client[i].getBalance());
	}


	public static void createAccounts(BankAccount[] ba) {
		for (int i = 0; i < ba.length; i++) {
			System.out.printf("Enter the balance for account %d: ", (i + 1));
			Scanner sc = new Scanner(System.in);
			float balance = sc.nextFloat();
			ba[i] = new BankAccount(balance);
		}
	}
}
