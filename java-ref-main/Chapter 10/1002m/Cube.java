
public class Cube extends Rectangle {
	
	private double height;

	public Cube(double l, double w, double h) {
		super(l, w);
		height = h;
	}
	
	public double getSurfaceArea() {
		return Math.ceil(getArea() * 6);
	}

	public double getVolume() {
		return Math.ceil(getArea() * height);
	}
	
	public double getHeight() {
		return height;
	}
}