/* Chapter 5.1 - Introduction to Methods

	--> methods break a complex program to small manageable pieces, (divide and conquer), thus enabling easier problem solving and code reuse
	--> void method simply executes a group of statements and then terminates e.g. System.out.println()
	--> a value-returning method returns a value to the statement that called it e.g. the random class nextInt() method
	--> methods are defined generally with a header and the body. The header comprises of method modifiers, a return type, method name and parentheses.
			**Method modifiers - the keywords 'public' and 'static' are the modifiers, where public implies the method is available to code outside the class while static means the method belongs to the class rather than a specific object.
			**Return type - uses the keyword 'void' or list a data type
			**Method name - its good practice to give a method a descriptive name. In general, rules that apply to variable names also apply to method names
			**Parentheses - method names are always followed by a set of parentheses, and thus can be capable of receiving arguments. When this is the case,
						a list of one or more variable declarations will appear inside the parentheses.
	--> the main method is automatically called when a program starts, but other methods are executed by method call statements. When a method is called, 
		the JVM branches to that method and executes the statements in its body. Calling a method is simply typing its name followed by a parentheses,
		with no space in between.
	--> methods can also be called in hierarchical or layered fashion i.e. method A can call method B, which can then call method C. When C finishes executing, the JVM returns to method B, and when method B finishes executing, the JVM returns to method A.
	--> documentation comments should always be written just before the method's definition, to give a brief explanation of the method's purpose.

*/

import javax.swing.JOptionPane;
/**This program uses two void methods*/
public class Medium501 {
  public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Welcome to the Credit Card Approval Program.");
		String userIn = JOptionPane.showInputDialog("What is you annual salary?");
		double annualSalary = Double.parseDouble(userIn);
		userIn = JOptionPane.showInputDialog("And, on a scale of 1 through 10, what is your credit rating?\n (10 = excellent, 1 = very bad)");
		int creditRating = Integer.parseInt(userIn);
		if (annualSalary >= 20000 && creditRating >= 7)
			qualify();
		else
			noQualify();
		System.exit(0);
  }
	
	/**Informs the user he or she qualifies for the credit card*/
	public static void qualify() {
		JOptionPane.showMessageDialog(null, "Congratulations! You qualify for the credit card.");
	}

	/**Informs the user he or she doen't qualify for the credit card.*/
	public static void noQualify() {
		JOptionPane.showMessageDialog(null, "Sorry. You do not qualify for the credit card.");
	}
}
