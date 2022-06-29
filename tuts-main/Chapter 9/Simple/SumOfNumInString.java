import javax.swing.*;


public class SumOfNumInString {

	public static void main(String[] sth) {

		String in = JOptionPane.showInputDialog("Enter a series of numbers separated by commas, I present the sum");
		String[] r = in.split(",");
		int tot = 0;
		for (String s : r)
			tot += Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, "Your sum is " + tot);
	}
}