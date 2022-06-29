import javax.swing.*;


public class SumOfDigInString {

	public static void main(String[] sth) {

		String in = JOptionPane.showInputDialog("Enter a series of numbers not separated by anything; I present the sum");
		String[] r = new String[in.length()];
		for (int i = 0; i < in.length(); i++)
			r[i] = in.substring(i, i+1);
		int tot = 0;
		for (String s : r)
			tot += Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, "Your sum is " + tot);
		JOptionPane.showMessageDialog(null, "The highest value is " + high(r));
		JOptionPane.showMessageDialog(null, "The lowest value is " + low(r));
	}

	public static int high(String... r) {
		int h = Integer.parseInt(r[0]);
		for (String s : r) {
			if ( Integer.parseInt(s) > h)
				h = Integer.parseInt(s);
		}
		return h;
	}

	public static int low(String... r) {
		int l = Integer.parseInt(r[0]);
		for (String s : r) {
			if ( Integer.parseInt(s) < l)
				l = Integer.parseInt(s);
		}
		return l;
	}
}