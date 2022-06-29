
class Telephone {

	public final static int FORMATTED_LENGTH = 13;
	public final static int UNFORMATTED_LENGTH = 10;

	public static boolean isFormatted(String s) {
		boolean b = false;
		if (s.charAt(0) == '(' && s.charAt(4) == ')' && s.charAt(8) == '-' && s.length() == FORMATTED_LENGTH)
			b = true;
		return b;
	}

	public static String unformat(String s) {
		StringBuilder g = new StringBuilder(s);
		if (isFormatted(s)) {
			g.deleteCharAt(0);
			g.deleteCharAt(3);
			g.deleteCharAt(6);
		}
		return g.toString();
	}

	public static String format(String s) {
		StringBuilder b = new StringBuilder(s);
		if (b.length() == UNFORMATTED_LENGTH) {
			b.insert(0, '(');
			b.insert(4, ')');
			b.insert(8, '-');
		}
		return b.toString();
	}
}