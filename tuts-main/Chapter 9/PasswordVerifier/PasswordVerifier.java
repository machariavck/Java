import javax.swing.*;

public class PasswordVerifier {

	public static void main(String[] sth) {
		String in = JOptionPane.showInputDialog("Enter a valid password. \n\n\n(Should be of more than 6 characters long, have at " +
						"least one uppercase letter, one lowercase letter and at least one digit)");
		Password userPassword = new Password(in);
		while (!userPassword.verify()) {
			in = JOptionPane.showInputDialog("That was an invalid password. Enter again");
			userPassword.setPassCode(in);
		}
		JOptionPane.showMessageDialog(null, "That password is valid");
	}
}