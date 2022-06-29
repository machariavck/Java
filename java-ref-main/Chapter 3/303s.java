/* Chapter 3.3 Nested if Statements

	--> can be used to test more than one condition

*/
import javax.swing.JOptionPane;

public class Simple303 {               
	public static void main(String[] sth) {
		int testScore;
		String sthInput;
		sthInput = JOptionPane.showInputDialog("Please enter you grade");
		testScore = Integer.parseInt(sthInput);
		if (testScore < 60) {
			JOptionPane.showMessageDialog(null, "You have a grade F, and please take your studies seriously"); 
		} else {
			if (testScore < 70) {
				JOptionPane.showMessageDialog(null, "You have a grade D, please read more");
			} else {
				if (testScore < 80) {
					JOptionPane.showMessageDialog(null, "You have a grade C, work hard, you'll get there");
				} else {
					if (testScore < 90) {
						JOptionPane.showMessageDialog(null, "You have grade B, nice work, keep improving!");
					} else {
						JOptionPane.showMessageDialog(null, "You have grade A, excellent job!!!");
					}
				}
			}
		}
	System.exit(0);
	}
}
