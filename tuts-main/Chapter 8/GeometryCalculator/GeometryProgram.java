import java.util.*;

public class GeometryProgram {

	public static void main(String[] sth) {
		
		System.out.print("\nGeometry Calculator\n1. Calculate the Area of a Circle\n2. Calculate the Area of a Rectangle" + 
							"\n3. Calculate the Area of a Triangle\n4. Quit\n\nEnter your choice (1-4): ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y, z;
		while (x < 1 || x > 4) {
			System.out.print("Incorrect value. Try again.\nEnter your choice (1-4): ");
			x = sc.nextInt();
		}
		if (x == 1) {
			System.out.print("Provide the radius: ");
			y = sc.nextDouble();
			System.out.printf("Area is %.2f\n", Geometry.areaCircle(y));
		} else if (x == 2) {
			System.out.print("Provide the length: ");
			y = sc.nextDouble();
			System.out.print("Provide the width: ");
			z = sc.nextDouble();
			System.out.printf("Area is %.2f\n", Geometry.areaRectangle(y, z));
		} else if (x == 3) {
			System.out.print("Provide the base: ");
			y = sc.nextDouble();
			System.out.print("Provide the height: ");
			z = sc.nextDouble();
			System.out.printf("Area is %.2f\n", Geometry.areaTriangle(z, y));
		} else
			System.exit(0);
	}
}