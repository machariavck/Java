
import javax.swing.JOptionPane;

public class CelsiusTemperatureTable {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Celsius Temperature Table v2.0. Press OK to continue..");
		for (int x = 1; x <= 20; x++) {
			JOptionPane.showMessageDialog(null, String.format("%d Fahrenheit is equivalent to %.1f Celsius", x, celsius(x)));
		}
	}
	public static float celsius(float y) {
		return (5 * y - 160) / 9.0f;
	}
}
