import java.util.*;

public class Translator {

	public static void main(String[] sth) {
		String input = welcome();
		System.out.println("Here is your input: " + input + ". Its equivalent to this: " + translate(input));
	}


	public static String translate(String b) {
		StringBuilder g = new StringBuilder(b);
		for (int i = 0; i < g.length(); i++) {
			if (Character.isLetter(g.charAt(i))) {
				if (g.charAt(i) > 64 && g.charAt(i) < 68)
					g.replace(i, i+1, "2");
				else if (g.charAt(i) > 67 && g.charAt(i) < 71)
					g.replace(i, i+1, "3");
				else if (g.charAt(i) > 70 && g.charAt(i) < 74)
					g.replace(i, i+1, "4");
				else if (g.charAt(i) > 73 && g.charAt(i) < 77)
					g.replace(i, i+1, "5");
				else if (g.charAt(i) > 76 && g.charAt(i) < 80)
					g.replace(i, i+1, "6");
				else if (g.charAt(i) > 79 && g.charAt(i) < 84)
					g.replace(i, i+1, "7");
				else if (g.charAt(i) > 83 && g.charAt(i) < 87)
					g.replace(i, i+1, "8");
				else if (g.charAt(i) > 86 && g.charAt(i) < 91)
					g.replace(i, i+1, "9");
			}
		}
		return g.toString();
	}


	public static String welcome() {
		System.out.println("\nWelcome to the number translator. Enter a number in the format XXX-XXX-XXXX (use caps in case of letters)");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		while (!isValid(in)) {
			System.out.println("\nThat's an incorrect phone number. Try again in the format XXX-XXX-XXXX (use caps in case of letters)");
			in = sc.nextLine();
		}
		return in.toUpperCase();
	}


	public static boolean isValid(String g) {
		boolean valid = true;
		if (g.length() != 12 || g.charAt(3) != '-' || g.charAt(7) != '-')
			valid = false;
		if (valid) {
			for (int i = 0; i < g.length(); i++) {
				if (!Character.isLetterOrDigit(g.charAt(i)) && i != 3 && i != 7 && !Character.isUpperCase(g.charAt(i)))
					valid = false;
			}
		}
		return valid;
	}
}