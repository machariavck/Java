
import javax.swing.JOptionPane;
import java.util.Random;

public class CelsiusToFahrenheitTable {
	public static void main(String[] sth) {
		int celsius;
		float fahrenheit;
		System.out.println("\n\t||CELSIUS||\t\t\t||FAHRENHEIT EQUIVALENT||");
		System.out.println("==========================================================================");
		for (celsius = 0; celsius < 26; celsius++) {
			fahrenheit = (9F*celsius/5) + 32F;
			System.out.printf("\t %d \t\t\t\t\t %5.1f\n", celsius, fahrenheit);
		}
		System.exit(0);
	}
}
