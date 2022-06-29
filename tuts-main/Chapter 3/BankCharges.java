
import javax.swing.JOptionPane;

public class BankCharges {
	public static void main(String[] sth) {
		final int BASE_FEE = 10;
		float checkFee, totalFees;
		short numberOfChecks;
		String userInput = JOptionPane.showInputDialog("Hello, please provide the number of checks written for the month.");
		numberOfChecks = Short.parseShort(userInput);
		String output;
		if (numberOfChecks < 40 && numberOfChecks > 0) {
			checkFee = numberOfChecks < 20 ? 0.1F: 0.08F;
			totalFees = (checkFee * numberOfChecks) + BASE_FEE;
			output = String.format("Your total charge is $%,.2f/=", totalFees);
			JOptionPane.showMessageDialog(null, output);
		} else if (numberOfChecks > 39 && numberOfChecks < 100) {
			checkFee = numberOfChecks < 60 ? 0.06F: 0.04F;
			totalFees = (checkFee * numberOfChecks) + BASE_FEE;
			output = String.format("Your total charge is $%,.2f/=", totalFees);
			JOptionPane.showMessageDialog(null, output);
		} else {
			JOptionPane.showMessageDialog(null, "You have entered and INVALID value!");
		}
	}
}
