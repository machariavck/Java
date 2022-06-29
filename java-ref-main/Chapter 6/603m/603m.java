/*	Chapter 6.3 Instance Fields and Methods

	--> since each instance of a class has its own set of fields, several instances of a class can be created and different values be stored in each instance's fields
	--> instance methods operate on an instance of a class
	--> the example below creates three instances of the Rectangle class which are referenced by the variables kitchen, bedroom and den
	--> since each instance of the Rectangle class acquires its own length and width variables, the variables are referred as instance variables or instance fields
	--> all of the methods in the Rectangle class are instance methods because they perform operations on specific instances of the class i.e. each time the setLength method is called, it stores a value in a particular object of the Rectangle class; bedroom.setLength(), den.setLength(), kitchen.setLength()
	--> instance methods don't have the keyword static in their headers

*/

import javax.swing.JOptionPane;

public class Medium603 {

	public static void main(String[] eta) {

		Rectangle kitchen = new Rectangle();
		String in = JOptionPane.showInputDialog("What is the kitchen's length?");
		kitchen.setLength(Double.parseDouble(in));
		in = JOptionPane.showInputDialog("What is the kitchen's width?");
		kitchen.setWidth(Double.parseDouble(in));
		Rectangle bedroom = new Rectangle();
		in = JOptionPane.showInputDialog("What is the bedroom's length?");
		bedroom.setLength(Double.parseDouble(in));
		in = JOptionPane.showInputDialog("What is the bedroom's width?");
		bedroom.setWidth(Double.parseDouble(in));
		Rectangle den = new Rectangle();
		in = JOptionPane.showInputDialog("What is the den's length?");
		den.setLength(Double.parseDouble(in));
		in = JOptionPane.showInputDialog("What is the den's width?");
		den.setWidth(Double.parseDouble(in));
		double area = den.getArea() + bedroom.getArea() + kitchen.getArea();
		JOptionPane.showMessageDialog(null, "The total area of the rooms is " + area);
		System.exit(0);
	}
}
