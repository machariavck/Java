
public class Metric {
	
	public static int count;
	
	public Metric() {
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public static double milesToKM(double m) {
		return m * 1.609;
	}

	public static double kmToMiles(double k) {
		return k / 1.609;
	}
}