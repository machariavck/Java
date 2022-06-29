
import javax.swing.JOptionPane;

public class BudgetAnalysis {
	public static void main(String[] sth) {
		int totalExpenses = 0;
		JOptionPane.showMessageDialog(null, "Welcome to the Budget Analysis Program v1.0. Press OK to continue");
		String userInput = JOptionPane.showInputDialog("I will help see if your monthly budget is viable. How much are you planning to budget?");
		int monthlyBudget = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog("You have entered " + monthlyBudget + ". Now feed me with your expenses, one by one and enter 0 when done.");
		int expenses = Integer.parseInt(userInput);
		while ( expenses != 0 ) {
			totalExpenses += expenses;
			userInput = JOptionPane.showInputDialog("Another expense...");
			expenses = Integer.parseInt(userInput);
		}
		if (totalExpenses > monthlyBudget) {
			JOptionPane.showMessageDialog(null, String.format("Your expenses are greater than your budget by a value of %d (budget %d, total expenses %d). RE-EVALUATE YOUR BUDGET!!", (totalExpenses - monthlyBudget), monthlyBudget, totalExpenses));
		} else if (totalExpenses < monthlyBudget) {
			JOptionPane.showMessageDialog(null, String.format("Your budget will work, and you will have some extra cash of %d", (monthlyBudget - totalExpenses)));
		} else {
			JOptionPane.showMessageDialog(null, "Your budget is exactly equal to the expenses. Make sure your expenses do not incur additional costs.");
		}
		System.exit(0);
	}
}
