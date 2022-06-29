import java.util.Scanner;

public class ChargeAccountValidation {

	public static void main(String[] sth) {
		System.out.println("\nWelcome to the account validation program. Enter an account number to test if valid.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean check = ifValid(input);
		if (check)
			System.out.println("Your account number is valid");
		else
			System.out.println("That number is not a valid account number");
	}

	public static boolean ifValid(int accNumber) {

		int[] accountNumbers = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
								8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231,
								6545231, 3852085, 7576651, 7881200, 4581002 };
		
		boolean valid = false;
		int index = 0;
		
		while (index < accountNumbers.length && !valid) {
			if (accountNumbers[index] == accNumber)
				valid = true;
			index++;
		}
		
		return valid;
	}
}
				
		