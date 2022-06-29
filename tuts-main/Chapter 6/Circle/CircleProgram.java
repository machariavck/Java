import java.util.Scanner;

public class CircleProgram {
	
	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello. Feed me with the circle's radius and I'll provide the rest of its properties.");
		double r = sc.nextDouble();
		Circle c = new Circle(r);
		System.out.printf("\n\nRadius: %.2f\nDiameter: %.2f\nCircumference: %.2f\nArea: %.2f", c.getRadius(), c.getDiameter(), c.getCircumference(), c.getArea());
		System.out.println("\n\nBye");
	}
}