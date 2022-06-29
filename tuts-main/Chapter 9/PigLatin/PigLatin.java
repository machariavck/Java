import java.util.*;


public class PigLatin {

	public static void main(String[] sth) {

		System.out.println("Enter a sentence I convert to Pig Latin");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println("Here is your statement in Pig Latin\n" + toPigLatin(in));
	}


	public static String toPigLatin(String n) {
		String[] r = n.split(" ");
		StringBuilder[] rr = new StringBuilder[r.length];
		for (int i = 0; i < r.length; i++)
			rr[i] = new StringBuilder(r[i]);
		for (int i = 0; i < rr.length; i++) {
			if (rr[i].length() > 1) {
				rr[i].append(rr[i].charAt(0) + "AY");
				rr[i].deleteCharAt(0);
			} else
				rr[i].append("AY");
		}
		StringBuilder g = new StringBuilder();
		for (StringBuilder p : rr)
			g.append(p + " ");
		return (g.toString()).toUpperCase();
	}
}