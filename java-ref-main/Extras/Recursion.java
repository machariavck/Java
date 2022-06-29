
class Recursion {

	//	n determines the 'depth of recursion'
	static int factorial(int n) {
		System.out.println("n has the value: " + n);

		//	base case
		if (n == 1) return 1;

		//	recursive case
		return factorial(n-1) + n;
	}

	public static void main(String[] sth) {
		int num = 3;
	//	for (int num = 2; num <= 20; num++)
			System.out.println("Factorial of " + num + " is " + factorial(num));
	}
}