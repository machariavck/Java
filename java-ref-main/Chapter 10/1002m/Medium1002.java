/* Chapter 10.2 - Calling the Superclass Constructor

	--> the 'super' keyword refers to an object's superclass, where it's used to call a superclass constructor
	--> if a superclass has multiple overloaded constructors or doesn't have a default / no-arg constructor, the 'super'
		keyword is used to call a superclass constructor explicitly
	--> there are three guidelines about calling a superclass constructor;
		* the 'super' statement is written only in the subclass' constructor; can't be called from any other method
		* the 'super' statement must be the first statement in the subclass' constructor; that's because the superclass'
			constructor must execute before the code in the subclass' constructor executes
		* if a subclass constructor doesn't explicitly call a superclass constructor, Java will automatically call the
			superclass' default or no-arg constructor, just before the code in the subclass' constructor executes; that's
			similar to placing this statement at the beginning of a subclass constructor;		super();
	--> if a superclass doesn't have a default constructor and doesn't have a no-arg constructor, then a subclass must
		call one of the constructors that the superclass does have; if it doesn't, a compile error

*/

import javax.swing.*;

public class Medium1002 {

	public static void main(String[] sth) {
		String l = JOptionPane.showInputDialog("Enter the length of a cube");
		String w = JOptionPane.showInputDialog("Enter the width of a cube");
		String h = JOptionPane.showInputDialog("Enter the height of a cube");
		
		Cube c1 = new Cube(Double.parseDouble(l), Double.parseDouble(w), Double.parseDouble(h));
		
		String out = "\nLength: " + c1.getLength() + "\nWidth: " + c1.getWidth() + "\nHeight: " +
					c1.getHeight() + "\nBase Area: " + c1.getArea() + "\nSurface Area: " +
					c1.getSurfaceArea() + "\nVolume: " + c1.getVolume();
		JOptionPane.showMessageDialog(null, out);
	}
}
