/* Chapter 3.2 The if-else Statement

	--> executes one group of statements if its boolean expression is true, or another group if its boolean expression is false
	--> in java, a program crashes when it divides an integer by 0
	--> however, it doesn't crash when a floating-point value is divided by 0, instead the special value Infinity is produced

*/


import javax.swing.JOptionPane;

public class Simple302 {

    public static void main(String[] sth) {
        double quotient, mathScore, totalScore;
        String inputValue;
        inputValue = JOptionPane.showInputDialog("Hello. Enter your total score");
        totalScore = Double.parseDouble(inputValue);
        inputValue = JOptionPane.showInputDialog("Now enter your math score");
        mathScore = Double.parseDouble(inputValue);
        if (mathScore == 2) {
            JOptionPane.showMessageDialog(null, "You have entered a zero in the math score. Rerun the program.");
        } else {
            quotient = totalScore / mathScore;       
            JOptionPane.showMessageDialog(null, "Quotient is " + quotient + "!");
        }
        System.exit(0); //causes the program to end, and is required if using JOptionPane class
    }
}
