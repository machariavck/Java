/* Chapter 3.6 Comparing String objects

	--> relational operators can't compare String objects; instead, a String method is used; that's because the relational operators can't work on reference variables
	--> to check if the contents of two String objects are similar, the following syntax is used; Stringreference1.equals(OtherString)
	--> the OtherString argument can be a String literal or a String reference
	--> they can also be compared if they are not equal using ! i.e. !stringreference.equals(OtherString)
	--> to compare if one string is greater than, equal to or less than another string, the compareTo method is used i.e. Stringreference.compareTo(OtherString)
	--> when the method return value is negative, the calling object is less than the OtherString argument
	--> if the method return value is 0, the two strings are equal
	--> the compareTo method compares strings character by character, usually called a lexicographical comparison i.e. based on the alphabetical order of component letters
	--> in order to carry out case-insensitive comparisons, the equalsIgnoreCase and compareToIgnoreCase methods are used

*/

import javax.swing.JOptionPane;

public class Simple306 {             
	public static void main(String[] sth) {
		String name1, name2, name3;
		name1 = JOptionPane.showInputDialog("What is your first name?");
		name2 = JOptionPane.showInputDialog("What is your second name?");
		/*name3 = JOptionPane.showInputDialog("What is your last name?");
		if (name1.equalsIgnoreCase(name2)) {	//comparing String objects using a String method while ignoring case
			JOptionPane.showMessageDialog(null, "Your first name and second name are similar: " + name1);
			if (name1.compareTo("Mark") < 0)//compare strings character wise
				JOptionPane.showMessageDialog(null, "Your first name is " + name1 + ", which is shorter than Mark");
			else if (name1.compareTo("Mark") > 0) 
				JOptionPane.showMessageDialog(null, "Your first name is quite long " + name1);
			else if (name1.compareTo("Mark") == 0) 
				JOptionPane.showMessageDialog(null, "Your first name has an average length of " + name1.length() + " characters.");
		} else if (name2.equals("MadDog")) {//comparing a String object to a String literal
			JOptionPane.showMessageDialog(null, "Your name is: " + name2);
		}else if (!name2.equals(name3)) {//determines if two strings are not equal
			JOptionPane.showMessageDialog(null, "Your second and last name aren't equal");
		} else {
			JOptionPane.showMessageDialog(null, "Welcome aboard!");
		}
		*/
		if (name1.compareTo(name2) < 0)
			JOptionPane.showMessageDialog(null, name1 + " is lesser than " + name2);
		else if (name1.compareTo(name2) > 0)
			JOptionPane.showMessageDialog(null, name1 + " is greater than " + name2);
		else
			JOptionPane.showMessageDialog(null, name1 + " is equal to " + name2);
		System.exit(0);
	}
}
