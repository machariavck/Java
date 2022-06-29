import static java.lang.System.*;

class RecursivePopulationClass {

	public static void main(String[] sth) {
		double starting = 10;
		double increase = 0.5;
		int days = 7;
		func(starting, increase, 0, days);
	}

	static void func(double i, double d, int current, int n) {
		if (current == n) return;
		System.out.println("The current population on day " + (current + 1) + " is " + i);
		func(Math.ceil(i*(d+1)), d, ++current, n);
	}
}