/* Chapter 4.3 Using the 'while' Loop for Input Validation

	--> used to create input routines that repeat until acceptable data is entered
	--> the integrity of a program's output is only as good as its input (garbage in, garbage out)
	--> input validation is the process of inspecting data given to a program by the user to see if it's valid; the 'while' loop is preferrably useful in validating input
	--> for the input validation logic, the reading operation that takes place just before the loop is called the 'priming read'; it provides the first value for the loop to test and then subsequent values are provided by the loop
*/

import javax.swing.JOptionPane;

public class Simple403 {

	public static void main(String[] sth) {
		String userInput = JOptionPane.showInputDialog("Hello, input a number between 1 and 100. I'll provide it's square value");
		short num_User = Short.parseShort(userInput);		//this is the priming read
		while (num_User < 1 || num_User > 100) {
			userInput = JOptionPane.showInputDialog("You have provided an incorrect value. Please provide a value between 1 and 100.");
			num_User = Short.parseShort(userInput);
		}
		JOptionPane.showMessageDialog(null, "Your value " + num_User + " has a square value of " + Math.pow(num_User, 2) + ".");
	}
}
