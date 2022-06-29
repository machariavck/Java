import javax.swing.*;

public class MonthTest {

	public static void main(String[] sth) {
		boolean t = true;
		while (t) {
			try {
				String g = JOptionPane.showInputDialog("Enter a month number");
				Month month = new Month(Integer.parseInt(g));
				JOptionPane.showMessageDialog(null, "The month name is " + month.getMonthName());
				t = false;
			} catch (IncorrectMonthNumber e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
}