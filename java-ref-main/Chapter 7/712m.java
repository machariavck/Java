/*	Chapter 7.12 Command-Line Arguments and Variable-Length Argument Lists

	--> when a Java program is invoked from the operating system command line, specific arguments can be passed into the main method of the program
	--> moreso, a method can be written that takes a variable number of arguments such that when it runs, it can determine the number of arguments that were passed
		to it and act accordingly
	--> inside the parentheses of the main method header is the declaration of a parameter, in our case named sth, which is an array name. As its declaration indicates,
		it's used to reference an array of Strings. The array that's passed into the sth parameter comes from the operating system command line
	--> to execute the program below, the program is first compiled and then executed with the command below;
				java Medium712 How Does This Work?
	--> any items typed on the command line, separated by spaces and after the name of the class are considered to be one or more arguments that are to be passed into
		the main method; as in our case, the four arguments passed are;
				'How' which is passed into sth[0]
				'Does' is passed into sth[1]
				'This' is passed into sth[2]
				'Work?' is passed into sth[3]
	--> the name of main's parameter array can be anything you wish, but the standard convention is args
	--> Java provides a mechanism named 'variable-length argument lists' which makes it possible to write a method that takes a variable (or any) number of arguments
		when it is called. The declaration of such a method is shown below;
				public static int sum(int... numbers)
	--> the ellipsis (three periods) following the data type indicates that numbers is a 'vararg parameter' which takes a variable number of arguments
	***vararg parameters are actually arrays
	--> a method can also be written to accept a variable number of object references as arguments e.g.
				public static double totalBalance(BankAccount... accounts)
	--> a method can also be written to accept a mixture of fixed-length arguments and a variable-length argument list e.g.
				public static void courseAverage(String course, double... scores)
	--> when a method accepts a mixture of fixed-length arguments and a variable-length argument list, the vararg parameter must be declared last
	--> an array can also be passed to a vararg parameter; basically here, using three periods is just syntactic sugar for the square brackets

*/

import java.util.Scanner;

public class Medium712 {

	public static void main(String[] sth) {
		int[] v = new int[sth.length];
		for (int i = 0; i < sth.length; i++) {
			v[i] = Integer.parseInt(sth[i]);
			System.out.println(Math.pow(v[i], 2));
		}
		
		System.out.println("This is the sum of 3 and 4 from a vararg parameter method: " + sum(3,4));
		System.out.println("This is the sum of 3, 5, 6 and 4 from a vararg parameter method: " + sum(3,5,6,4));
		System.out.println("This is the sum of 3, 5, 6, 7, 8, 9 and 4 from a vararg parameter method: " + sum(3,5,6,7,8,9,4));
		
		System.out.println("\n\nBank Account example;");
		
		BankAccount account1 = new BankAccount(500);
		BankAccount account2 = new BankAccount(1000);
		BankAccount account3 = new BankAccount(3000);
		BankAccount account4 = new BankAccount(4000);
		BankAccount account5 = new BankAccount(5000);

		System.out.println("The total of account1 and account2: KES " + totalBalance(account1,account2));
		System.out.println("The total of account1, account2 and account3: KES " + totalBalance(account1,account2,account3));
		System.out.println("The total of account1, account2, account3 and account4: KES " + totalBalance(account1,account4,account2,account3));
		System.out.println("The total of account1, account2, account3, account4 and account5: KES " + totalBalance(account1,account4,account2,account3,account5));

	}

	/**illustrates a vararg parameter list method which takes integers as the arguments*/
	public static int sum(int... v) {
		int total = 0;
		for (int i : v)
			total += i;
		return total;
	}

	/**illustrates a vararg parameter list that takes object references as the arguments*/
	public static int totalBalance(BankAccount... acc) {
		int total = 0;
		for (BankAccount accB : acc)
			total += (int)accB.getBalance();
		return total;
	}
}
