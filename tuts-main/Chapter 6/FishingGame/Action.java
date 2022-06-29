import javax.swing.JOptionPane;

public class Action {

	private int points;

	public Action(int a) {
		points = 0;
		worth(a);
	}

	public void worth(int v) {
		if (v == 3) {
			JOptionPane.showMessageDialog(null, "That's an old shoe. You get a single point.");
			points = 1;
		} else if (v == 5) {
			JOptionPane.showMessageDialog(null, "That's a wrecked helmet. You get three points.");
			points = 3;
		} else if (v == 6) {
			JOptionPane.showMessageDialog(null, "That's a gold fish! You get TWENTY points!");
			points = 20;
		} else if (v == 2)	{
			JOptionPane.showMessageDialog(null, "That's a little savage we call a catfish. You get thirteen points.");
			points = 13;
		} else if (v == 4) {
			JOptionPane.showMessageDialog(null, "That's just a small fish. You get ten points.");
			points = 10;
		} else {
			JOptionPane.showMessageDialog(null, "Wow, a big fish. Big points you get. Eighteen points!");
			points = 18;
		}
	}

	public int getPoints() {
		return points;
	}
}