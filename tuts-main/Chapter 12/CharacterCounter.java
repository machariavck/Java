import static java.lang.System.*;

class CharacterCounter {

	public static void main(String[] sth) {
		var ch = ("I want to buy a book but it's too expensive").toCharArray();
		char c = 't';
		out.println(func(c, ch.length-1, 0, ch) + " character(s) present");
	}

	static int func(char c, int counter, int n, char... ch ) {
		if (counter < 0) return n;
		if (ch[counter] == c) return func(c, --counter, ++n, ch);
		return func(c, --counter, n, ch);
	}
}