import javax.swing.*;

public class BackwardString {

	public static void main(String[] sth) {
		String in = JOptionPane.showInputDialog("Enter a string I return a reversed version of it");
		reverseString(in);
		System.exit(0);
	}

	public static void reverseString(String g) {
		char[] r = g.toCharArray();
		String n = "";
		for (int i = r.length - 1; i >= 0; i--)
			n += String.valueOf(r[i]);
		JOptionPane.showMessageDialog(null, "Your reverse value is: \n\n " + n);
	}
}