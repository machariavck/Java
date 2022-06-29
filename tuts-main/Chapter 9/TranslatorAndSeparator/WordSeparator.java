import java.util.*;

public class WordSeparator {

	public static void main(String[] sth) {
		System.out.println("Enter a combined-word sentence (I mean something like this: \"StopAndSmellTheRoses\"");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println("Here's the modified sentence:\n" + modified(in));
	}


	public static String modified(String n) {
		StringBuilder g = new StringBuilder(n);
		for (int i = 1; i < g.length(); i++) {
			if (Character.isUpperCase(g.charAt(i))) {
				g.replace(i, i+1, (g.substring(i, i+1)).toLowerCase());
				g.insert(i, " ");
			}
		}
		return g.toString();
	}
}