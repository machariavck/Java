import java.util.Scanner;
import java.io.*;

public class ChargeAccountValidation2 {

	public static void main(String[] sth) throws IOException {
		System.out.println("\nWelcome to the account validation program. Enter an account number to test if valid.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean check = ifValid(input);
		if (check)
			System.out.println("Your account number is valid");
		else
			System.out.println("That number is not a valid account number");
	}

	public static boolean ifValid(int accNumber) throws IOException {

		File of = new File("numbers.txt");
		Scanner rf = new Scanner(of);
		
		boolean valid = false;
		
		while (rf.hasNext() && !valid) {
			if (rf.nextInt() == accNumber)
				valid = true;
		}
		
		return valid;
	}
}
				
		