
import javax.swing.JOptionPane;

public class RomanNumerals {
	public static void main(String[] sth) {
		short userNumber;
		String userInput = JOptionPane.showInputDialog("Good Evening user! I want to convert your number to a Roman numeral; just make it between 1 and 10.");
		userNumber = Short.parseShort(userInput);
		switch (userNumber) {
			case 1:
			case 2:
				JOptionPane.showMessageDialog(null, "Your Roman Numeral is " + (userNumber == 1 ? "I": "II") + " because your number is " + userNumber);
				break;
			case 3:
			case 4:
				JOptionPane.showMessageDialog(null, "Your Roman Numeral is " + (userNumber == 4 ? "IV": "III") + " because your number is " + userNumber);
				break;
			case 5:
			case 6:
				JOptionPane.showMessageDialog(null, "Your Roman Numeral is " + (userNumber == 6 ? "VI": "V") + " because your number is " + userNumber);
				break;
			case 7:
			case 8:
				JOptionPane.showMessageDialog(null, "Your Roman Numeral is " + (userNumber == 8 ? "VIII": "VII") + " because your number is " + userNumber);
				break;
			case 9:
			case 10:
				JOptionPane.showMessageDialog(null, "Your Roman Numeral is " + (userNumber == 10 ? "X": "IX") + " because your number is " + userNumber);
				break;
			default:
				JOptionPane.showMessageDialog(null, "You have entered an invalid number");
		}
		System.exit(0);
	}
}
