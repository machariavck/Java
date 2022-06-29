
import javax.swing.JOptionPane;


public class MultipleStockSales {
	public static void main(String[] sth) {
		float nS, pP, pC, sP, sC, total = 0;
		String gg = JOptionPane.showInputDialog("~WELCOME TO THE STOCK PROFIT CALCULATOR~\n\n\nSo, how many stock sales did you make?");
		if (Integer.parseInt(gg) == 0)
			System.exit(0);
		int stocks = Integer.parseInt(gg);
		for (int x = 1; x <= stocks; x++) {
			float gross = 0;
			gg = JOptionPane.showInputDialog("Great, for stock " + x + ", how many shares did it have??");
			nS = Float.parseFloat(gg);
			gg = JOptionPane.showInputDialog("Now, please provide your purchase price per share for stock " + x);
			pP = Float.parseFloat(gg);
			gg = JOptionPane.showInputDialog("The purchase commission paid for stock " + x);
			pC = Float.parseFloat(gg);
			gg = JOptionPane.showInputDialog("Sale price per share for stock " + x);
			sP = Float.parseFloat(gg);
			gg = JOptionPane.showInputDialog("Lastly, the sale commission paid for stock " + x);
			sC = Float.parseFloat(gg);
			gross = stockProfit(nS, pP, pC, sP, sC);
			total += gross;
		}
		if (total < 0)
			JOptionPane.showMessageDialog(null, String.format("Oouuh, you made a loss bro. Of $%.2f", total));
		else if (total > 0)
			JOptionPane.showMessageDialog(null, String.format("YEEEES!! You made a profit of $%.2f", total));
		else
			JOptionPane.showMessageDialog(null, "You did not make any profit. Or loss.");
	}
	public static float stockProfit(float ns, float pp, float pc, float sp, float sc) {
		return ((ns * sp) - sc) - ((ns * pp) + pc);
	}
}
