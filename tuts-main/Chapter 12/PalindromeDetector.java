import static java.lang.System.*;

class PalindromeDetector {

	public static void main(String[] sth) {
		String g = "Kayak";

		if (isPalindrome(g, 0, g.length()-1))
			out.println("That's a palindrome.");
		else
			out.println("That's not a palindrome.");
	}

	static boolean isPalindrome(String g) {
		int f = 0, l = g.length()-1;
		if (f > l) return true;

		while (!Character.isLetter(g.charAt(f))) ++f;
		while (!Character.isLetter(g.charAt(l))) --l;
		
		if (Character.toLowerCase(g.charAt(f)) != Character.toLowerCase(g.charAt(l))) return false;

		return isPalindrome(g, f+1, l-1);

	}
}