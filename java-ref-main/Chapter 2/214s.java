/*	Chapter 2.14 Dialog Boxes

	--> a dialog box is a small graphical window that displays a message to the user or requests input
	--> they are quickly displayed using the JOptionPane class
	--> threads are simply tasks
	--> the showInputDialog method always returns the user's input as a string, even if its numeric data
	--> in that case, one has to convert the input to a numeric value (from string value to numeric value)
	--> methods used are part of Java's wrapper classes e.g. Byte.parseByte, Float.parseFloat, Integer.parseInt

*/


import javax.swing.JOptionPane; //enables use of the JOptionPane class

public class simple214 {               

    public static void main(String[] sth) {
        double priceRetail;
        String newV;
        newV = JOptionPane.showInputDialog("Enter the retail price");
        priceRetail = Double.parseDouble(newV);
        JOptionPane.showMessageDialog(null, "The price is " + priceRetail + "!");
        System.exit(0); //causes the program to end, and is required if using JOptionPane class
    }
}
