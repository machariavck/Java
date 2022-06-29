/* Chapter 8.1 Static Class Members

	--> a static member belongs to the class, not objects instantiated from the class
	--> as such, an instance of the class doesn't have to exist in order to use a static member
	--> a single copy of a class' static field is shared by all instances of a class
	--> a sample declaration of a static field;
			private static int count = 0;	//'static' is after the access specifier and before the data type
	--> Java automatically stores 0 in all uninitialized static member variables
	--> when you create multiple instances of a class and try to access the static field from any of the 
		objects, the same value would be returned
	--> to execute a static method, an instance of the class need not to be created
	--> the name of the class is simply written before the dot operator in the method call
	--> static methods are often used to create utility classes that perform operations on data, but have no 
		need to collect and store data
	--> However, static methods cannot refer to non-static members of the class i.e. any method called from a
		static method must also be static and if the method uses any of the class' fields, they must be static
		as well
	
*/
import javax.swing.*;

public class Medium801 {

	public static void main(String[] sth) {
		String in = JOptionPane.showInputDialog("Enter a mile to be converted to km");
		double km = Double.parseDouble(in);
		JOptionPane.showMessageDialog(null, String.format("Those are %.2f km", Metric.milesToKM(km)));
		in = JOptionPane.showInputDialog("Enter a km to be converted to m");
		double m = Double.parseDouble(in);
		JOptionPane.showMessageDialog(null, String.format("Those are %.2f miles", Metric.kmToMiles(m)));		
		Metric nm = new Metric();
		Metric nm2 = new Metric();
		Metric nm3 = new Metric();
		JOptionPane.showMessageDialog(null, String.format("%d metric objects have been created", Metric.count));
		System.exit(0);
	}
}
