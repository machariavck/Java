/* Chapter 4.6 Running Totals and Sentinel Values

	--> a running total is a sum of numbers that accumulates with each iteration of a loop; the variable used to keep the running total is called an accumulator
	--> a sentinel is a value that signals when the end of a list of values has been reached
	--> a crucial step is initializing the accumulator variable with a value of 0
	--> a sentinel is used when the user does not know the exact number of items or the user is entering values from several lists thus impractical to count
	--> in such situations, a sentinel is used at the end of list, which is a special value that cannot be mistaken as a member of the list, and signals that there are no more values to be entered; when the user enters the sentinel value, the loop terminates

*/

import javax.swing.JOptionPane;

public class Simple406 {

	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Hello. Welcome to this total sales program.");
		JOptionPane.showMessageDialog(null, "Just provide your sales each day and I will sum them up. When you're done, enter -1 to quit.");
		String userInput;
		double totalSales = 0;
		int day = 0;
		do {
			userInput = JOptionPane.showInputDialog(String.format("Enter the sales for day %d:", ++day));
			totalSales += Double.parseDouble(userInput); //running total
		} while (Double.parseDouble(userInput) != -1);	//sentinel value
			JOptionPane.showMessageDialog(null, String.format("For %d days, the total sales are $%,.2f", --day, ++totalSales));
	}
}
