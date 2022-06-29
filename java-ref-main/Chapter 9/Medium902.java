/* Chapter 9.2 Character Testing and Conversion with the Character Class

	--> the Character class is a wrapper class for the 'char' data type and provides numerous methods for testing and converting character data
	--> this class is part of the java.lang package, thus no need for the import statement
	--> several static methods are provided for testing the value of a char variable such as the following; where each accepts a single char
		argument and returns a boolean value i.e. isDigit, isLetter, isLetterOrDigit, isLowerCase, isUpperCase, isSpaceChar, isWhitespace
	--> to convert the case of a character, the following static methods can be used; each accepts a char argument and returns a char value i.e.
			toLowerCase, toUppercase	e.g.	System.out.println(Character.toLowerCase('A'));
	--> if the argument passed to the toLowerCase() method is an uppercase letter, it returns the lowercase equivalent; if it was already in
		lowercase, the method returns it unchanged. Same case applies to the toUpperCase() method. Any non-letter argument passed to these
		methods is returned as it is

*/


import javax.swing.JOptionPane;

public class Medium902 {

	public static void main(String[] sth) {
		String in;
		do {
			in = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNN\n(LLL = letters and NNNN=numbers)");

			if (isValid(in))
				JOptionPane.showMessageDialog(null, "That's a valid customer number.");
			else
				JOptionPane.showMessageDialog(null, "That is not the proper format of a customer number.\nHere is an example: ABC1234");

			in = JOptionPane.showInputDialog("Do you want to repeat this?");

		} while (Character.toUpperCase(in.charAt(0)) == 'Y');

		System.exit(0);

		//testChar();
	}


	public static boolean isValid(String g) {
		boolean b = true;
		int i = 0;
		if (g.length() != 7)
			b = false;
		while (b && i < 3) {
			if (!Character.isLetter(g.charAt(i)))
				b = false;
			i++;
		}
		while (b && i < 7) {
			if (!Character.isDigit(g.charAt(i)))
				b = false;
			i++;
		}
		return b;
	}


	public static void testChar() {
		String in = JOptionPane.showInputDialog("Enter any single character.");
		char ch = in.charAt(0);
		if (Character.isLetter(ch))
			JOptionPane.showMessageDialog(null, "That's a letter.");
		if (Character.isDigit(ch))
			JOptionPane.showMessageDialog(null, "That's a digit.");
		if (Character.isLowerCase(ch))
			JOptionPane.showMessageDialog(null, "That's a lowercase letter.");
		if (Character.isUpperCase(ch))
			JOptionPane.showMessageDialog(null, "That's an uppercase letter.");
		if (Character.isSpaceChar(ch))
			JOptionPane.showMessageDialog(null, "That's a space character.");
		if (Character.isWhitespace(ch))
			JOptionPane.showMessageDialog(null, "That's a whitespace character.");
	}
}