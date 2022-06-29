import static java.lang.System.*;

class maxElementMethod {

	public static void main(String[] sth) {
		int[] r = { 21, 2, 4, 69, 43, 23, 22, 91, 99, 47, 53, 11, 79, 78, 102 };
		out.println("Largest num on array is " + maxElement(r[0], r.length-1, r));
	}

	static int maxElement(int max, int pos, int... r) {
		if (pos < 0) return max;
		else if (r[pos] > max) return maxElement(r[pos], pos-1, r);
		else return maxElement(max, pos-1, r);
	}
}