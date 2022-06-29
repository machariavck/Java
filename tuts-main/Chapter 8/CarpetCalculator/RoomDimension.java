
public class RoomDimension {

	private double length;
	private double width;

	public RoomDimension(double l, double w) {
		length = l;
		width = w;
	}
	public RoomDimension() {
		this(1, 1);
	}
	public RoomDimension(double d) {
		this(d, 1);
	}
	public RoomDimension(RoomDimension r) {
		length = r.length;
		width = r.width;
	}

	public double getArea() {
		return length * width;
	}

	public String toString() {
		return String.format("Room Dimensions\n===============\nLength: %.1f feet\nWidth: %.1f feet", length, width);
	}
}