
import javax.swing.JOptionPane;
import java.util.Random;

public class SumOfNumbers {
	public static void main(String[] sth) {
		String userInput = JOptionPane.showInputDialog("Hello. Give me a positive integer value and I'll give the sum from 1 to that number.");
		int numUser = Integer.parseInt(userInput);
		long sum = 0;
		while (numUser <= 0) {
			userInput = JOptionPane.showInputDialog("You have provided an incorrect value. Please provide me with a value greater than zero");
			numUser = Integer.parseInt(userInput);
		}
		for (int k = 0; k <= numUser; k++) {
				sum += k;
		}
		JOptionPane.showMessageDialog(null, String.format("The sum till that number is %d", sum));
		System.exit(0);
	}
}
