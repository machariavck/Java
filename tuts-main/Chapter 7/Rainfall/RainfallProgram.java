import javax.swing.JOptionPane;
import java.util.ArrayList;

public class RainfallProgram {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Hello. This is the rainfall program");
		ArrayList<Rainfall> monthlyRain = new ArrayList<>(12);
		for (int i = 0; i < 12; i++) {
			String in = JOptionPane.showInputDialog("Enter rainfall for month " + (i + 1));
			while (Double.parseDouble(in) < 99)
				in = JOptionPane.showInputDialog("Rainfall can't be less than 99 in this climate");
			monthlyRain.add(new Rainfall(in));
		}
		String out = "Total Rainfall for the year: " + getTotalRain(monthlyRain) +
					" \nAverage Monthly Rainfall: " + getMonthlyRain(monthlyRain) +
					"\nMonth with most rain was month " + getMonthWithMostRain(monthlyRain) +
					"\nMonth with least rain was month " + getMonthWithLeastRain(monthlyRain);
		JOptionPane.showMessageDialog(null, out);
	}

	public static double getTotalRain(ArrayList<Rainfall> rF) {
		double totalRain = 0;
		for (int i = 0; i < rF.size(); i++) {
			Rainfall r = rF.get(i);
			totalRain += r.getRain();
		}
		return totalRain;
	}
	
	public static double getMonthlyRain(ArrayList<Rainfall> rL) {
		return (int)(getTotalRain(rL) / 12);
	}
	
	public static int getMonthWithMostRain(ArrayList<Rainfall> rA) {
		double mostRain = 0;
		int month = 0;
		for (int r = 0; r < rA.size(); r++) {
			Rainfall rrr = rA.get(r);
			if (rrr.getRain() > mostRain) {
				month = r + 1;
				mostRain = rrr.getRain();
			}
		}
		return month;
	}
	
	public static int getMonthWithLeastRain(ArrayList<Rainfall> rN) {
		int month = 0;
		double leastRain = getMonthlyRain(rN);
		for (int r = 0; r < rN.size(); r++) {
			Rainfall rrr = rN.get(r);
			if (rrr.getRain() < leastRain) {
				month = r + 1;
				leastRain = rrr.getRain();
			}
		}
		return month;
	}
	
}