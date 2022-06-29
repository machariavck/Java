import static java.lang.System.*;

class SumOfNumbers {

	public static void main(String[] sth) {
		int n = 1000;
		out.println("sum to " + n + " is " + func(n));
	}

	static int func(int n) {
		if (n == 1) return 1;
		return n + func(n-1);
	}
}