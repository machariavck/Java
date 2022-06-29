import javax.swing.*;


public class TelephoneProgram {

	public static void main(String[] sth) {
		String in = JOptionPane.showInputDialog("Enter phone number in US format\n\nExample: (123)456-2123");
		if (Telephone.isFormatted(in)) {
			JOptionPane.showMessageDialog(null, "Nice. That is a well-formatted number");
			JOptionPane.showMessageDialog(null, "Now, let's see the unformatted version");
			JOptionPane.showMessageDialog(null, Telephone.unformat(in));
			JOptionPane.showMessageDialog(null, "Now, let's see the reformatted version");
			JOptionPane.showMessageDialog(null, Telephone.format(Telephone.unformat(in)));
		} else
			JOptionPane.showMessageDialog(null, "That number isn't formatted");
		
		System.exit(0);
	}
}