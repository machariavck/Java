

class StringReverser {

	public static void main(String[] sth) {
		String g = "vctor kura";
		func(g, g.length()-1);
	}

	static void func(String g, int pos) {
		if (pos < 0) return;
		else System.out.print(g.charAt(pos));
		func(g, pos-1);
	}
}