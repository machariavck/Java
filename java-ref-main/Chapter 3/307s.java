/* Chapter 3.7 More about Variable Declaration and Scope

	 --> A simple reminder of good programming practice: declare variables near where they are about to be used

*/

import javax.swing.JOptionPane;

public class Simple307 {
	public static void main(String[] sth) {
		String name1, name2, name3;
		name1 = JOptionPane.showInputDialog("What is your first name?");
		name2 = JOptionPane.showInputDialog("What is your second name?");
		if (name1.equalsIgnoreCase(name2)) {//comparing String objects using a String method while ignoring case
			JOptionPane.showMessageDialog(null, "Welcome aboard!");
		}
	System.exit(0);
	}
}
