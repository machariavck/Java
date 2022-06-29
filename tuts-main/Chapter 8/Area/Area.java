
public class Area {

	public static double getArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static double getArea(int length, int width) {
		return length * width;
	}

	public static double getArea(double radius, int height) {
		return Math.PI * 2 * radius * (radius + height);
	}
}