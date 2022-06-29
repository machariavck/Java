import static java.lang.System.out;

class RecursivePowerMethod {

	public static void main(String[] sth) {
		int num = 4;
		int exp = num - 1;
		out.println(num + " raised to the power of " + exp + " is " + func(num, exp));
	}

	static int func(int num, int exp) {
		if (exp == 1) return num;
		return num * func(num, exp - 1);
	}
}