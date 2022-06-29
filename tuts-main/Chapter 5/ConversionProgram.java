
import javax.swing.JOptionPane;

public class ConversionProgram {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Welcome to the distance conversion program. Press OK to continue.");
		String str = "no";
		do {
			String sr = JOptionPane.showInputDialog("Enter the distance in meters that you wish to convert..");
			float meters = Float.parseFloat(sr);
			while (meters < 1) {
				sr = JOptionPane.showInputDialog("Invalid value. Try again");
				meters = Float.parseFloat(sr);
			}
			do {
				int snt = menu();
				if (snt != 4) {
					while (snt > 4 || snt < 1) {
						sr = JOptionPane.showInputDialog("Invalid value. Try again");
						snt = Integer.parseInt(sr);
					}
					if (snt == 1)
						showKilometers(meters);
					else if (snt == 2)
						showInches(meters);
					else if (snt == 3)
						showFeet(meters);
					sr = JOptionPane.showInputDialog("Will you carry out more conversion?");
				}
			} while (sr.charAt(0) == 'y' || sr.charAt(0) == 'Y');
			str = JOptionPane.showInputDialog("Do you wish to enter meters again? Enter yes to proceed, no to quit");
		} while (str.charAt(0) == 'Y' || str.charAt(0) == 'y');
		JOptionPane.showMessageDialog(null, "BYE!");
	}
	public static void showKilometers(float m) {
		float km = m * 0.001f;
		JOptionPane.showMessageDialog(null, String.format("%.3f meters is %.3f kilometers.", m, km));
	}
	public static void showInches(float m) {
		float in = m * 39.37f;
		JOptionPane.showMessageDialog(null, String.format("%.3f meters is %.2f inches.", m, in));
	}
	public static void showFeet(float m) {
		float ft = m * 3.281f;
		JOptionPane.showMessageDialog(null, String.format("%.3f meters is %.3f feet.", m, ft));
	}
	public static int menu() {
		String gg = JOptionPane.showInputDialog("1. Convert to Kilometers\n2. Convert to Inches\n3. Convert to Feet\n4. Quit the program");
		return Integer.parseInt(gg);
	}
}







































