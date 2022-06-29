import java.util.Scanner;

public class Geometry {

	public static double areaCircle(double r) {
		Scanner sc = new Scanner(System.in);
		while (r < 0) {
			System.out.println("Incorrect value. Try again");
			System.out.print("Radius: ");
			r = sc.nextDouble();
		}
		return Math.PI * Math.pow(r, 2);
	}

	public static double areaRectangle(double l, double w) {
		Scanner sc = new Scanner(System.in);
		while (l < 0 || w < 0) {
			System.out.println("Incorrect value of " + (l < 0 ? "length" : "width") + ". Try again");
			System.out.print((l < 0 ? "length" : "width") + ": ");
			double c = sc.nextDouble();
			if (l < 0)
				l = c;
			else
				w = c;
		}
		return l * w;
	}

	public static double areaTriangle(double b, double h) {
		Scanner sc = new Scanner(System.in);
		while (b < 0 || h < 0) {
			System.out.println("Incorrect value of " + (b < 0 ? "base" : "height") + ". Try again");
			System.out.print((b < 0 ? "base" : "height") + ": ");
			double c = sc.nextDouble();
			if (b < 0)
				b = c;
			else
				h = c;
		}
		return 0.5 * b * h;
	}
}