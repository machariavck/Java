/* Chapter 3.4 The 'if else-if' Statement

	--> it makes it simpler to test a series of conditions with the if-else-if statement
	--> here's the general format;
			if (expression_1)	{ 
	 					[block of statements] }
			else if (expression_2) {
	 					[block of statements] }
						//Insert as many 'else if' statements as possible
			else {
						 [block of statements] }
	--> when expression_1 is true, the block of statements are executed, and the rest of the structure is ignored
	--> otherwise, if expression_2 is true, the block of statements execute, and the rest of the structure is ignored
	--> the last else clause, called the trailing else, is optional but happens to be needed in most cases and executes when none of the expressions are true
	--> include braces when more than one statement are to be executed
	--> the trailing else, which is optional, is often used to catch errors
	--> the if-else-if statement is a better version of nested if-else statements (logic is easier to follow and identation here is better)

*/
import javax.swing.JOptionPane;

public class Simple304 {               
	public static void main(String[] sth) {
		int testScore;
		String sthInput;
		sthInput = JOptionPane.showInputDialog("Please enter you grade");
		testScore = Integer.parseInt(sthInput);
		if (testScore < 60) {
			JOptionPane.showMessageDialog(null, testScore + " is a poor score, category F");
		} else if (testScore < 70) {
			JOptionPane.showMessageDialog(null, testScore + " is a bad score, category D, do better");
		} else if (testScore < 80) {
			JOptionPane.showMessageDialog(null, testScore + " is not a very good score, category C, improve");
		} else if (testScore < 90) {
			JOptionPane.showMessageDialog(null, testScore + " is a good score, category B, but you can improve!");
		} else if (testScore < 100){
			JOptionPane.showMessageDialog(null, testScore + " is an excellent score. Category A");
		} else {
			JOptionPane.showMessageDialog(null, testScore + " is an unreal score");
		}
	System.exit(0);
	}
}
