

class RecursiveMultiplication {

	public static void main(String[] sth) {
		System.out.println(func(8, 3));
	}

	static int func(int x, int y) {
		if (y == 1) return x;
		return x + func(x, y-1);
	}
}


		