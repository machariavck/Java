
import javax.swing.JOptionPane;
import java.util.Scanner;

class isPrimeMethod {
	public static void main(String rho[]) {
		String uII = JOptionPane.showInputDialog("Welcome to the Prime Numbers Software v1.0. \nWhat do you wish to do?" +
			"\na) Print a range of prime numbers? \nb) Test a number if its a prime number \n(enter a or b to proceed)");
		if (uII.charAt(0) == 'a' || uII.charAt(0) == 'a')
			printPrime();
		else
			testPrime();
	}
	
	public static void printPrime() {
		String uw = JOptionPane.showInputDialog("So, give a maximum number to which we should print prime numbers.");
		int maxValue = Integer.parseInt(uw);
		boolean iAmPrime = false;
		for (int g = 1; g <= maxValue; g++) {
			int count = 0;
			for (int h = 1; h <= g; h++) {
				if ((g % h) == 0)
					count++;
			}
			iAmPrime = count == 2 ? true: false;
			if (iAmPrime)
				System.out.print(g + ", ");
		} 
		JOptionPane.showMessageDialog(null, "Great..that's done");
	}
	public static void testPrime() {
		String uI = JOptionPane.showInputDialog("Enter any number to test if it's a prime number. \n\n (a number between 1 and 100)");
		while (Short.parseShort(uI) < 1 || Short.parseShort(uI) > 100) {
			uI = JOptionPane.showInputDialog("Incorrect number entered. Try again!!");
		}
		int testNumber = Integer.parseInt(uI);
		if (isPrime(testNumber))
			JOptionPane.showMessageDialog(null, "That is a prime number bro");
		else
			JOptionPane.showMessageDialog(null, "That isn't prime!!");
	}

	public static boolean isPrime(int tN) {
		boolean ifPrime = false;
		int counter = 0;
		for (int x = 1; x <= tN; x++) {
			if ((tN % x) == 0)
				counter++;
		}
		ifPrime = counter == 2 ? true: false;
		return ifPrime;
	}
}