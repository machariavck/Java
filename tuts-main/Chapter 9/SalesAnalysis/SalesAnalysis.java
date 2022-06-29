import javax.swing.*;
import java.io.*;
import java.util.*;

public class SalesAnalysis {

	public static void main(String[] sth) throws IOException {

		fileData f = welcome();
		total(f);
		average(f);
		highLow(f);
		System.exit(0);
	}

	public static fileData welcome() throws IOException {
		String in = JOptionPane.showInputDialog("Welcome to the Sales Analysis App. Enter the name of the file to read data from");
		File of = new File(in);
		while (!of.exists()) {
			in = JOptionPane.showInputDialog("That file doesn't exist, enter again");
			of = new File(in);
		}
		return new fileData(in);
	}


	public static void total(fileData d) {
		StringBuilder sb = new StringBuilder();
		double total = 0;
		double subTotal;
		for (int i = 0; i < d.getNumOfWeeks(); i++) {
			subTotal = 0;
			for (double dd : d.getWeekData(i))
				subTotal += dd;
			sb.append(String.format("Week %d has had a total sales of KES %,.2f\n", (i+1), subTotal));
			total += subTotal;	
		}
		sb.append(String.format("\n\nThe grand total sales of all weeks is KES %,.2f", total));
		JOptionPane.showMessageDialog(null, sb.toString());
	}


	public static void average(fileData d) {
		StringBuilder sb = new StringBuilder();
		double total = 0;
		double subTotal, dailyAverage, weeklyAverage;
		for (int i = 0; i < d.getNumOfWeeks(); i++) {
			subTotal = 0;
			for (double dd : d.getWeekData(i))
				subTotal += dd;
			dailyAverage = subTotal / 7;
			sb.append(String.format("Week %d has had a daily average sales of KES %,.2f\n", (i+1), dailyAverage));
			total += subTotal;	
		}
		weeklyAverage = total / d.getNumOfWeeks();
		sb.append(String.format("\n\nThe average weekly sales is KES %,.2f", weeklyAverage));
		JOptionPane.showMessageDialog(null, sb.toString());
	}


	public static void highLow(fileData d) {
		StringBuilder sb = new StringBuilder();
		double[] total = new double[d.getNumOfWeeks()];
		for (int i = 0; i < d.getNumOfWeeks(); i++) {
			for (double dd : d.getWeekData(i))
				total[i] += dd;
		}
		double highest = total[0];
		int h = 0;
		double lowest = total[0];
		int l = 0;
		for (int i = 0; i < total.length; i++) {
			if (total[i] > highest) {
				highest = total[i];
				h = i;
			}
			if (total[i] < lowest) {
				lowest = total[i];
				l = i;
			}
		}				
		sb.append(String.format("Week %d had the highest sales of KES %,.2f\n\nWeek %d had the lowest sales of KES %,.2f", (h + 1), highest, (l + 1), lowest));
		JOptionPane.showMessageDialog(null, sb.toString());
	}
}