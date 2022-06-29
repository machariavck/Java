//static block is always executed first

class StaticBlocks {

	static int t;

	static {
		t = 50;
		System.out.println("Static block running, t is " + t);
	}

/*
	StaticBlocks(String g) {
		System.out.println(g);
		t = 7;
		System.out.println("t is now " + t);
	}
*/

	public static void main(String[] sth) {
		//new StaticBlocks("Constructor running");
		System.out.println("Hello world! " + t);
	}
}