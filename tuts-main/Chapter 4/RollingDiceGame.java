
import javax.swing.JOptionPane;
import java.util.Random;

public class RollingDiceGame {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Welcome to the ROLLING DICE GAME!! Press OK to roll the dice");
		Random diceRoll = new Random();
		int firstRoll, secondRoll;
		char userChoice;
		String userInput, stringBuffer;
		do {
			firstRoll = diceRoll.nextInt(6) + 1;
			secondRoll = diceRoll.nextInt(6) + 1;
			stringBuffer = String.format("Great. You have rolled a %d and a %d. Do you wish to play again? (Reply with yes or no)", firstRoll, secondRoll);
			userInput = JOptionPane.showInputDialog(stringBuffer);
			userChoice = userInput.charAt(0);
		} while (userChoice == 'y' || userChoice == 'Y');
	}
}
