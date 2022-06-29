
import javax.swing.JOptionPane;

public class RetailPriceCalculator {
	public static void main(String[] sth) {
		String uI = JOptionPane.showInputDialog("Welcome to the Retail Price Calculator. First give me the wholesale price of your product.");
		short wholesalePrice = Short.parseShort(uI);
		uI = JOptionPane.showInputDialog("Now, give me the markup percentage of that item.");
		float markupPercentage = Float.parseFloat(uI);
		short retailPrice = calculateRetail(wholesalePrice, markupPercentage);
		JOptionPane.showMessageDialog(null, "Your retail price should be " + retailPrice);
	}
	public static short calculateRetail(short wP, float mP) {
		return (short)(wP + wP * mP);	
	}
}
