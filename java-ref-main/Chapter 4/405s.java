/* Chapter 4.5 The 'for' Loop

	--> used to perform a known number of iterations
	--> there are two categories of loops; conditional loops and count-controlled loops; conditional loops execute as long as a particular condition exists
	--> loop that repeats a specific number of times is known as a count-controlled loop, and possesses three elements;
		+ must initialize a control variable to a starting value
		+ must test the control variable by comparing it to a maximum value; when the control variable reaches its maximum value, the loop terminates
		+ must update the control variable during each iteration; usually done by incrementing or decrementing the variable
	--> in Java, the 'for' loop is ideal for writing count-controlled loops, usually designed to initialize, test and update a loop control variable
				for (Initialization; Test; Update) {		//loop header - consists of initialization expression, boolean expression and update expression
					Statement(s);							//Step1 - Initialization, Step2 - Test, Step3 - Execute Statements, Step4 - Update
				}
	--> the 'for' loop is a pretest loop; it evaluates the test (boolean) expression before each iteration
	--> multiple statements in the initialization and update expressions can be used; when using them, they're separated by commas
	--> boolean expressions can be combined using && or ||

*/

import javax.swing.JOptionPane;

public class Simple405 {

	public static void main(String[] sth) {
		//String userInput = JOptionPane.showInputDialog("Hey. How low should I go from 30? Give me a number.");
		//double min_Value = Double.parseDouble(userInput); //this creates a user controlled loop
		//for (double count = 30; count >= min_Value; count-=2)	//declaring the control variable in the loop header limits its scope to the loop
		//JOptionPane.showMessageDialog(null, String.format("Number %.0f has the square of %.0f", count, Math.pow(count, 2)));
		int x, y;
		for (x = 1, y = 10; x<= 5; x++, y+=10) { //using multiple statements in initialization and update expressions
			System.out.println(x + " times " + y + " equals " + (x * y));
		}
	}
}
