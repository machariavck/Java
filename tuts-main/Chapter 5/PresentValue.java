
import javax.swing.JOptionPane;

public class PresentValue {
	public static void main(String[] beta) {
		String iN = JOptionPane.showInputDialog("Hello. How much do you wish to have in the future?");
		float futureValue = Float.parseFloat(iN);
		iN = JOptionPane.showInputDialog("So, which annual interest rate do you wish to be applied?");
		float annualRate = Float.parseFloat(iN);
		iN = JOptionPane.showInputDialog("How many years do you plan to let the money sit in the account?");
		int yearsNumber = Integer.parseInt(iN);
		iN = String.format("Well. You need $%,.2f to make $%,.2f in %d years with a rate of %.1f p.a.", presentValue(futureValue, yearsNumber, annualRate), futureValue, yearsNumber, annualRate);
		JOptionPane.showMessageDialog(null, iN);
	}
	
	public static float presentValue(float f, int y, float a) {
		return (float)Math.ceil((f / Math.pow((1 + (a / 100)), y)));
	}
}
