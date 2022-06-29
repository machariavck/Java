
import javax.swing.JOptionPane;

public class RectangleArea {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "This is the area of a rectangle calculator. Press OK to proceed");
		double length, width, area;
		length = getLength();
		width = getWidth();
		area = getArea(length, width);
		displayData(length, width, area);
	}
	public static double getLength() {
		String gg = JOptionPane.showInputDialog("Provide the length of the rectangle below");
		return Double.parseDouble(gg);
	}
	public static double getWidth() {
		String gg = JOptionPane.showInputDialog("Provide the width of the rectangle below");
		return Double.parseDouble(gg);
	}
	public static double getArea(double ee, double ll) {
		return ee * ll;
	}
	public static void displayData(double bb, double uu, double oo) {
		String gg = String.format("Since the length is %.1f and the width is %.1f, the area of the rectangle is %.2f", bb, uu, oo);
		JOptionPane.showMessageDialog(null, gg);
	}
}
