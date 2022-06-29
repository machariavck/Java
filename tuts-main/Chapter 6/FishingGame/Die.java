import java.util.Random;
import javax.swing.JOptionPane;

public class Die {

	private int value;
	private final int SIDES = 6;

	public Die() {
		roll();
		JOptionPane.showMessageDialog(null, "The hook is in.\n\nAnd now searching....\n\n(Press OK)");
	}

	void roll() {
		Random r = new Random();
		value = r.nextInt(SIDES) + 1;
	}

	public int getValue() {
		return value;
	}

}