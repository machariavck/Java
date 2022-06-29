/*	Chapter 6.7 Scope of Instance Fields

	--> instance fields are visible to all the class' instance methods
	--> if an instance field is declared with the public access specifier, it can also be accessed by code outside the class
	--> a parameter variable and a local variable cannot have the same name in the same method
	--> however, a local variable or a parameter variable can have the same name as a field
	--> when that happens, the local or parameter variable shadows the name of the field - meaning the field name is hidden
	--> for example, in the Rectangle class, let's assume that the Rectangle class' setLength method was written this way;
			public void setLength(double len) {
					int length;
					length = len;
			}
	--> in this code, a local variable bears the same name as a field; therefore, the local variable's name shadows the field name
	***when the 'length = len;' statement executes, the value of len is assigned to the local variable length, not to the field
	--> the unintentional shadowing of field names can cause elusive bugs, so it's best to avoid giving local variables the same names as fields

*/

import javax.swing.JOptionPane;

public class Medium607 {

	public static void main(String[] nu) {
		JOptionPane.showMessageDialog(null, "great stuff");
	}
}
