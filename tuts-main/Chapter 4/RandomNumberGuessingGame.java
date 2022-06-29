
import javax.swing.JOptionPane;
import java.util.Random;

public class RandomNumberGuessingGame {
	public static void main(String[] sth) {
		Random numGuess = new Random();
		int x = numGuess.nextInt(10) + 1;
		String userIn = JOptionPane.showInputDialog("Welcome to the Random Number Guessing Game. Guess the number I have between 1 and 10.");
		int userNo = Integer.parseInt(userIn);
		int count = 1;
		while ( userNo != x ) {
			count += 1;
			if ( userNo > x )  {
				userIn = JOptionPane.showInputDialog("Too high. Try again.");
				userNo = Integer.parseInt(userIn);
			} else {
				userIn = JOptionPane.showInputDialog("Too low. Try again.");
				userNo = Integer.parseInt(userIn);
			}
		}
		if (count > 1)
			JOptionPane.showMessageDialog(null, String.format("After guessing %d times, you finally got it right. The number I hold is %d", count, x));
		else 
			JOptionPane.showMessageDialog(null, "Nice. You got it by the first the guess. I hold the number " + x);
	}
}
