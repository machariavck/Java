/* Chapter 5.5 Problem Solving with Methods

	--> breaking down a complex program into smaller problems that can be handled with ease is called 'functional decomposition'
	--> recalling; any method that uses a Scanner object to open a file should have a throws IOException clause in its header
	--> and if a method calls another method that has a throws clause in its header, then the calling method should also have a throws clause in its header

*/

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**A sales report program*/
public class Medium505 {

    public static void main(String[] sth) throws IOException {
		JOptionPane.showMessageDialog(null, "Hello. Welcome to the Sales Report Program.");
		String fileName = getFileName();
		int tS = totalSales(fileName);
		int aDS = averageDailySales(tS);
		String output = String.format("The total sales for that month were %d thus the average daily sales in a span of 30 days is %d.", tS, aDS);
		JOptionPane.showMessageDialog(null, output);
	}

	/**Gets the file name
		@return Returns the file name that has sales for 30 days
	*/
	public static String getFileName() {
		String userIn = JOptionPane.showInputDialog("Provide me with the file name.");
		File newRead = new File(userIn);
		if (!newRead.exists()) {
			JOptionPane.showMessageDialog(null, "Error!!! The file doesn't exist. Goodbye...");
			System.exit(0);
		}
		return userIn;
	}
	
	/**Gets the total of the sales amount in the file
		@param nameProvided This takes the name of the file as the argument
		@return The total sales amount in the file is provided by the method
	*/
	public static int totalSales(String nameProvided) throws IOException {
		int rT = 0;
		File newRead = new File(nameProvided);
		Scanner uS = new Scanner(newRead);
		while (uS.hasNext()) {
			rT += uS.nextInt();
		}
		uS.close();
		return rT;
	}

	/**Calculates the average daily sales
		@param xyz Takes the value of the monthly total sales
		@return The method returns the average daily sales of that month
	*/
	public static int averageDailySales(int xyz) {
		return xyz / 30;
	}
}
