
import javax.swing.JOptionPane;

public class PaintJobEstimator {
	public static void main(String[] sth) {
		final float BASESQUAREFEET = 115.0f;
		final short LABORHOURS = 8;
		final float LABORCHARGEPERHOUR = 18.0f;
		JOptionPane.showMessageDialog(null, "This is the Paint Job Estimator Program");
		String uI = JOptionPane.showInputDialog("How many rooms will be painted?");
		int rooms = Integer.parseInt(uI);
		uI = JOptionPane.showInputDialog("What is the price of paint per gallon?");
		double costGallon = Integer.parseInt(uI);
		uI = JOptionPane.showInputDialog("What is the square feet of wall space in each room?");
		int sqFeetRoom = Integer.parseInt(uI);
		int gopr = gallonsOfPaintRequired(sqFeetRoom, rooms, BASESQUAREFEET);
		int hol = hoursOfLabor(sqFeetRoom, rooms, LABORHOURS, BASESQUAREFEET);
		double cop = costOfPaint(costGallon, gopr);
		double lc = laborCharges(hol, LABORCHARGEPERHOUR);
		totalCost(cop, lc);
	}
	public static int gallonsOfPaintRequired(int sFR, int r, float x) {
		return (int)(Math.ceil(sFR * r / x));
	}
	public static int hoursOfLabor(int sFR, int r, short y, float x) {
		return (int)(Math.ceil(sFR * r * y / x));
	}
	public static double costOfPaint(double cG, int g) {
		return cG * g;
	}
	public static double laborCharges(int h, float y) {
		return h * y;
	}
	public static void totalCost(double c, double l) {
		double t = c + l;
		String g = String.format("The total labor charges are %,.2f$ and the total paint cost is %,.2f$. Thus, total cost of the whole job would be %,.2f$", c, l, t);
		JOptionPane.showMessageDialog(null, g);
	}
}
