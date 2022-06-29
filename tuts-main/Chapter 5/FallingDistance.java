
import javax.swing.JOptionPane;

public class FallingDistance {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Falling Distance Program 1.0. Press OK to continue..");
		final float G = 9.8f;
		for (int x = 1; x <= 10; x++) {
			JOptionPane.showMessageDialog(null, String.format("The distance in %d seconds is %.2f meters", x, fallingDistance(x, G)));
		}
	}
	public static float fallingDistance(int y, float z) {
		return 0.5f * z * y * y;
	}
}
