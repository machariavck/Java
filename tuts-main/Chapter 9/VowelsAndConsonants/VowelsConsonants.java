
import javax.swing.*;

public class VowelsConsonants {

	public static void main(String[] sth) {
		String input = JOptionPane.showInputDialog("Enter a string");
		String userString = input;
		do {
			input = JOptionPane.showInputDialog("Enter a letter to perform an operation\n\na. Count the number of vowels in the string\n" + 
						"b. Count the number of consonants in the string\n" + "c. Count both the vowels and consonants in the " +
						"string\nd. Enter another string\ne. Exit the program");
			if (Character.toLowerCase(input.charAt(0)) == 'd') {
				input = JOptionPane.showInputDialog("Enter a string");
				userString = input;
			} else if (Character.toLowerCase(input.charAt(0)) != 'e')
				performOperation(userString, input);
		} while (Character.toLowerCase(input.charAt(0)) != 'e');
		
		JOptionPane.showMessageDialog(null, "Bye");
		System.exit(0);
	}

	/**run the chosen operation*/
	public static void performOperation(String us, String in) {
		VowCons vc = new VowCons(us);
		if (Character.toLowerCase(in.charAt(0)) == 'a')
			JOptionPane.showMessageDialog(null, "There are " + vc.returnVowels() + " vowels in this string: *" + us + "*");
		else if (Character.toLowerCase(in.charAt(0)) == 'b')
			JOptionPane.showMessageDialog(null, "There are " + vc.returnConsonants() + " consonants in this string: *" + us + "*");
		else if (Character.toLowerCase(in.charAt(0)) == 'c') {
			JOptionPane.showMessageDialog(null, "There are " + vc.returnVowels() + " vowels and " + vc.returnConsonants() +
						" consonants in this string: *" + us + "*");
		}
	}
}