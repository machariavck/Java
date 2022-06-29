import javax.swing.JOptionPane;

public class fishingGameProgram {

	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Hello. This is the fishing game program v6.0. Press OK to continue.");
		JOptionPane.showMessageDialog(null, "You are supposed to throw your hook in the water and I'll tell you what you caught and how much points you get. Okay?");
		int totalPoints = 0;
		String continuePlaying = JOptionPane.showInputDialog("Okay. Now let's start playing.\n\n\nEnter yes to continue, no to exit..");
		if (continuePlaying.charAt(0) == 'n' || continuePlaying.charAt(0) == 'N') {
			JOptionPane.showMessageDialog(null, "Bye");
			System.exit(0);
		}
		while (continuePlaying.charAt(0) == 'y' || continuePlaying.charAt(0) == 'Y') {
			Die die1 = new Die();
			Action fishingAction = new Action(die1.getValue());
			totalPoints += fishingAction.getPoints();
			continuePlaying = JOptionPane.showInputDialog("Do you want to continue fishing?\n\n(enter yes or no)");
		}
		JOptionPane.showMessageDialog(null, String.format("Congratulations. You earned %d fishing points!!!", totalPoints));
		System.exit(0);
	}
}