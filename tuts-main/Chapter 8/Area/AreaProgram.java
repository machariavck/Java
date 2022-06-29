
public class AreaProgram {

	public static void main(String[] sth) {

		System.out.printf("Area of a circle with radius 7 is %.1f\n", Area.getArea(7.0));
		System.out.printf("Area of a rectangle of length 5 and width 10 is %.1f\n", Area.getArea(5, 10));
		System.out.printf("Area of a cylinder of radius 7 and height 10 is %.1f\n", Area.getArea(7.0, 10));
	}
}