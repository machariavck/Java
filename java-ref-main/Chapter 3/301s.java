/*	Chapter 3.1 The if statement

	--> used to create a decision structure, thus a program can have more than one path of execution
	--> it causes one or more statements to execute only when a boolean expression is true
	--> the boolean expression is formed using a relational operator (determines whether a specific r/ship exists between two values)
	--> relational operators are binary i.e. use two operands e.g. <=, < must precede =, and there should be no space in-between
	--> when one of the statements is executed, it said to conditionally execute
	--> enclosing a group of statements inside braces creates a block of statements
	--> flag is a boolean variable that signals when some condition exists in the program; when set to true, condition exists
	--> Relational operators can be used to test character data as well as numbers i.e. using ==, <=, >=
	--> That's because characters are stored in memory as Unicode numbers i.e. 'A' = 65, 'B' = 66, 'a' = 97, ' ' = 32

*/

import javax.swing.JOptionPane; //enables use of the JOptionPane class

public class Simple301 {               
    public static void main(String[] sth) {
        double mathScore;
        String inputValue;
        boolean highScore = false;
        inputValue = JOptionPane.showInputDialog("Enter your math score");
        mathScore = Double.parseDouble(inputValue);
        JOptionPane.showMessageDialog(null, mathScore + " is an ordinary score");
        if (mathScore > 90)
            highScore = true;
        if (highScore)
            JOptionPane.showMessageDialog(null, "But it's from a remarkable individual");
        if ('A' < 'B')
            JOptionPane.showMessageDialog(null, "A is less than B");
        System.exit(0); //causes the program to end, and is required if using JOptionPane class
    }
}
