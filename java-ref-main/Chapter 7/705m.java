/* Chapter 7.5 Returning Arrays from Methods

	--> in addition to accepting arrays as arguments, methods may also return arrays
	--> to return a reference to an array, a method's return type must be declared properly e.g.
				public static int[] getScores();
	--> the method returns a reference to the array from the method, which could be stored in any compatible reference variable
	
*/


public class Medium705 {

	public static void main(String[] beta) {
		double[] values;
		values = getValues();
		for (double i : values)
			System.out.println(i + " ");
	}

	public static double[] getValues() {
		double[] arr = { 3.4, 2.3, 7.2, 9.6, 8.1, 5.6 };
		return arr;
	}
}
