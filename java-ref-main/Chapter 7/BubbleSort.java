
class BubbleSort {

	public static void main(String[] sth) {

		int[] num = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		for (var v : num) System.out.print("{" + v + "} ");
		System.out.println("\n\n\n");
		bubbleSort(num);
		for (var v : num) System.out.print("{" + v + "} ");

	}

	static void bubbleSort(int... r) {
		int a, b, t;
		for (a = 1; a < r.length; a++) {
			for (b = r.length - 1; b >= a; b--) {
				if (r[b] < r[b-1]) {
					t = r[b];
					r[b] = r[b-1];
					r[b-1] = t;
				}
			}
		}
	}
}