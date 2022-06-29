
import javax.swing.JOptionPane;
import java.util.Random;

public class ESPgame {
	public static void main(String[] sth) {
		String color, userInput;
		Random newR = new Random();
		int correctGuess = 0;
		int numB;
		for (int count = 0; count < 10; count++) {
			numB = newR.nextInt(5) + 1;
			if (numB == 1 || numB == 2)
				color = numB == 1 ? "blue":"red";
			else if (numB == 3 || numB == 4)
				color = numB == 3 ? "green":"orange";
			else
				color = "yellow";
			userInput = JOptionPane.showInputDialog("Hello there. I have selected a random color for you. Give me a guess which is it.");
			JOptionPane.showMessageDialog(null, String.format("You have selected the color %s. The randomly generated color is %s.", userInput, color));
			if (userInput.equalsIgnoreCase(color))
				correctGuess += 1;
		}
		JOptionPane.showMessageDialog(null, String.format("We have come to an end. You guessed %d times correctly", correctGuess));	
	}
}
