/* Chapter 5.3 More about Local Variables

	--> local variables are declared inside a method and cannot be accessed by statements from outside the method
	***different methods can have local variables with the same names because the methods cannot see each other's local variables
	--> a method's local variable exists only while the method is executing (aka its lifetime); all its parameter and local variables are destroyed when the method ends
	--> using parameter variables, local variables can also be initialized

*/

import javax.swing.JOptionPane;

public class Medium503 {

    public static void main(String[] sth) {
		texasBirds();
		californiaBirds();
		int x = 30;
		printSquare(x);
	}

	/**The texas method has a local variable named birds*/
	public static void texasBirds() {
		int birds = 5000;
		JOptionPane.showMessageDialog(null, "In Texas, we have appoximately " + birds + " birds.");
	}

	/**The california method has a local variable named birds too*/
	public static void californiaBirds() {
		int birds = 3500;
		JOptionPane.showMessageDialog(null, "In California, we have approximately " + birds + " birds.");
	}

	/**The printSquare method is self-explanatory*/
	public static void printSquare(int y) {
		int square = y * y;
		JOptionPane.showMessageDialog(null, "Square is " + square);
	}
}
