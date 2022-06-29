
public class Rectangle {

	private double length;
	private double width;

	/**	The setLength method stores a value in the length field.
		@param lengthIn The value to store in length. */
	public void setLength(double lengthIn) {
		length = lengthIn;
	}

	/** The setWidth method stores a value in the width field.
		@param widthIn The value to store in width. */
	public void setWidth(double widthIn) {
		width = widthIn;
	}

	/** The getLength method returns the value of a Rectangle object's length.
		@return the value in the length field. */
	public double getLength() {
		return length;
	}

	/** The getWidth method returns the value of a Rectangle object's width.
		@return The value in the width field. */
	public double getWidth() {
		return width;
	}
	
	/** The getArea method returns the area of a Rectangle object.
		@return The product of the length and width. */
	public double getArea() {
		return width * length;
	}
}
