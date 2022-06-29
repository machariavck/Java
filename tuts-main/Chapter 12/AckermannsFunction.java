import static java.lang.System.*;

class AckermannsFunction {

	public static void main(String[] sth) {
		/*
			(0,0) -> 1
			(0,1) -> 2
			(1,1) -> 3
			(1,2) -> 4
			(1,3) -> 5
			(2,2) -> 7
			(3,2) -> 29
		*/

		out.println(ackermann(3, 2));
	}

	static int ackermann(int m, int n) {
		if (m == 0) return n+1;
		if (n == 0) return ackermann(m-1, 1);
		return ackermann(m-1, ackermann(m, n-1));
	}
}