import javax.swing.JOptionPane;

public class MonthProgram {

	public static void main(String[] sth) {

		Month month = new Month();
		month.setMonthNumber(1);
		Month month2 = new Month("April");
	
		if (month.lessThan(month2))
			JOptionPane.showMessageDialog(null, "Month 12 is lesser");
		else
			JOptionPane.showMessageDialog(null, "Months not equal");
			
	}
}