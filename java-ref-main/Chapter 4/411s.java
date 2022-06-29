/* Chapter 4.11 Generating Random Numbers with the Random Class

	--> Random numbers are used in a variety of applications e.g. in games (rolling dice, show cards being drawn from a shuffled deck), simulation programs, statistical programs that randomly select data for analysis, computer security to encrypt sensitive data
	--> Java provides the Random class that you can use to generate random numbers, which is part of the java.util package i.e.
				Random randomNumbers = new Random();
	--> the randomNumbers variable will reference a Random object, whose method e.g. nextInt() method can be called to get a random integer number
	--> calling the nextInt method with no arguments returns an integer somewhere between -2,147,483,648 and +2,147,483,647. Alternatively, one can pass an argument that specifies an upper limit to the generated number's range
	--> one can add or subtract a value to shift the numeric range upward or downward
	--> other methods for generating random numbers using Random class include;
				nextDouble() - returns the next random number as a double within the range 0.0 through 1.0
				nextFloat() - returns the next random number as a float within the range 0.0 through 1.0
				nextInt(int n) - accepts an integer argument, n, returning a random integer between 0 through n
				nextLong() - returns the next random number as a long, within the range of a long( -9.22E18 to +9.22E18)

*/

import java.util.Random;
import javax.swing.JOptionPane;

public class Simple411 {

	public static void main(String[] sth) {
		int num1, num2, num3, sumNums, userSumValue;
		Random rnum = new Random();
		num1 = rnum.nextInt(100);	//value assigned is somewhere between 0 and 99
		num2 = rnum.nextInt(10) + 1;	//range was 0 to 9, adding 1 to it assigns a value between 1 through 10 to number
		num3 = rnum.nextInt(100) - 50; //random integer assigned to number is between -50 and +49
		String inputUser = JOptionPane.showInputDialog("Hello. Solve the following captcha.\n\t\t" + num1 + " + " + num2 + " + " + num3);
		userSumValue = Integer.parseInt(inputUser);
		sumNums = num1 + num2 + num3;
		if (userSumValue == sumNums) {
			JOptionPane.showMessageDialog(null, "Correct!! The sum is " + sumNums);
		} else {
			JOptionPane.showMessageDialog(null, String.format("No. %d is not the correct sum. The correct sum is %d.", userSumValue, sumNums));
		}
		System.exit(0);
	}
}





