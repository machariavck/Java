
import javax.swing.JOptionPane;

public class ShowChar {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Hello. Provide me a string and tell me to display the character at the position of your choice. Okay?");
		String output = JOptionPane.showInputDialog("Provide me with your string literal");
		String userIn = JOptionPane.showInputDialog("Give me a position.");
		int digit = Integer.parseInt(userIn);
		JOptionPane.showMessageDialog(null, String.format("Your char at position %d is %s.", digit, showChar(output, digit)));
	}
	public static char showChar(String gg, int tt) {
		return gg.charAt(tt);
	}
}
