
import javax.swing.JOptionPane;


public class StockProfit {
	public static void main(String[] sth) {
		float nS, pP, pC, sP, sC, gross;
		String gg = JOptionPane.showInputDialog("~WELCOME TO THE STOCK PROFIT CALCULATOR~\n\n\nFirst, provide the number of shares");
		nS = Float.parseFloat(gg);
		gg = JOptionPane.showInputDialog("Now, please provide your purchase price per share");
		pP = Float.parseFloat(gg);
		gg = JOptionPane.showInputDialog("The purchase commission paid");
		pC = Float.parseFloat(gg);
		gg = JOptionPane.showInputDialog("Sale price per share");
		sP = Float.parseFloat(gg);
		gg = JOptionPane.showInputDialog("Lastly, the sale commission paid");
		sC = Float.parseFloat(gg);
		gross = stockProfit(nS, pP, pC, sP, sC);
		if (gross < 0)
			JOptionPane.showMessageDialog(null, String.format("Oouuh, you made a loss bro. Of $%.2f", gross));
		else if (gross > 0)
			JOptionPane.showMessageDialog(null, String.format("YEEEES!! You made a profit of $%.2f", gross));
		else
			JOptionPane.showMessageDialog(null, "You did not make any profit. Or loss.");
	}
	public static float stockProfit(float ns, float pp, float pc, float sp, float sc) {
		return ((ns * sp) - sc) - ((ns * pp) + pc);
	}
}
