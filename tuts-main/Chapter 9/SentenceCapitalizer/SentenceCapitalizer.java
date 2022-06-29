
import javax.swing.*;

public class SentenceCapitalizer {

	public static void main(String[] sth) {
		String i = JOptionPane.showInputDialog("Enter a few sentences and I'll capitalize the first letter in each.");
		StringBuffer in = new StringBuffer(i);
		JOptionPane.showMessageDialog(null, "Your string has been formatted as below \n\n" + capitalize(in));
		System.exit(0);
	}

	public static String capitalize(StringBuffer g) {
		if (Character.isLetter(g.charAt(0)))
			g.setCharAt(0, Character.toUpperCase(g.charAt(0)));
		int i = g.indexOf(".");
		while (i != -1) {
			if (g.charAt(i+1) == ' ')
				g.setCharAt((i+2), Character.toUpperCase(g.charAt(i+2)));
			else
				g.setCharAt((i+1), Character.toUpperCase(g.charAt(i+1)));
			i = g.indexOf(".", (i + 1));
		}
		return g.toString();
	}
}