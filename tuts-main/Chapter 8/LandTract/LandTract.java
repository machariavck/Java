
public class LandTract {

	private double length;
	private double width;

	public LandTract(double l, double w) {
		length = l;
		width = w;
	}
	public LandTract() {
		this(1, 1);
	}
	public LandTract(LandTract lt) {
		length = lt.length;
		width = lt.width;
	}

	public double getArea() {
		return length * width;
	}

	public boolean equals(LandTract lt) {
		boolean b = false;
		if (this.length == lt.length && this.width == lt.width)
			b = true;
		return b;
	}

	public String toString() {
		return String.format("Tract\n===============\nLength: %.1f feet\nWidth: %.1f feet\nArea: %.1f square feet\n", length, width, this.getArea());
	}
}