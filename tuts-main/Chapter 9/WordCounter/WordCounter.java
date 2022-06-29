import javax.swing.*;

public class WordCounter {

	public static void main(String[] sth) {
		String in = JOptionPane.showInputDialog("Enter a string I return the word count");
		wordCount(in);
		System.exit(0);
	}

	public static void wordCount(String g) {
		String[] n = (g.trim()).split(" ");
		JOptionPane.showMessageDialog(null, "Your string has " + n.length + " words");
	}
}