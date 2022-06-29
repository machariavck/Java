
import javax.swing.JOptionPane;
import java.util.Random;

public class GameESP {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "~WELCOME TO THE EXTRASENSORY PERCEPTION PROGRAM v2.0~\n\nRandom colors will be generated for you to guess");
		String color, userIn;
		int correctTimes = 0, red = 0, green = 0, blue = 0, orange = 0, yellow = 0;
		Random rObj = new Random();
		for (int x = 0; x < 10; x++) {
			int y = rObj.nextInt(5);
			color = colorSelector(y);
			userIn = JOptionPane.showInputDialog("Guess the color I have now\n\n(choose between Red, Green, Blue, Orange and Yellow)");
			if (userIn.equalsIgnoreCase(color)) {
				correctTimes++;
				JOptionPane.showMessageDialog(null, "Nice. You guessed correctly. The color I had was " + color);
				if (userIn.equalsIgnoreCase("red"))
					red++;
				else if (userIn.equalsIgnoreCase("green"))
					green++;
				else if (userIn.equalsIgnoreCase("blue"))
					blue++;
				else if (userIn.equalsIgnoreCase("orange"))
					orange++;
				else if (userIn.equalsIgnoreCase("yellow"))
					yellow++;
			} else
				JOptionPane.showMessageDialog(null, "You guessed the color " + userIn + ". The color I had guessed was " + color);
		}
		JOptionPane.showMessageDialog(null, "You guessed " + correctTimes + " correct times. You guessed red " + red + " correct times, green " +
				green + " correct times, blue " + blue + " correct times, orange " + orange + " correct times and yellow " + yellow + " correct times.");
	}

	public static String colorSelector(int tt) {
		String color = "blank";
		switch (tt) {
			case 0:
					color = "red";
					break;
			case 1:
					color = "green";
					break;
			case 2:
					color = "blue";
					break;
			case 3:
					color = "orange";
					break;
			case 4:
					color = "yellow";
		}
		return color;
	}
			
}
