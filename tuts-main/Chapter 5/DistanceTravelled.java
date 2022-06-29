
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;

public class DistanceTravelled {
	public static void main(String[] sth) throws IOException {
		JOptionPane.showMessageDialog(null, "This is the Distance Travelled app v2.0. Press OK to continue..");
		String iN = JOptionPane.showInputDialog("What was the speed in miles per hour? \n\n(Enter a value between 0 and 999)");
		while (Integer.parseInt(iN) > 999 || Integer.parseInt(iN) < 1) {
			iN = JOptionPane.showInputDialog("Wrong Value. Enter the value for correct speed between 1 and 999 miles per hour!");
		}
		int speed = Integer.parseInt(iN);
		iN = JOptionPane.showInputDialog("Great. Now provide the time in hours. \n\n(Enter a value between 1 and 100)");
		while (Integer.parseInt(iN) > 99 || Integer.parseInt(iN) < 1) {
			iN = JOptionPane.showInputDialog("Incorrect value. Provide the correct time between 1 and 100 hours!");
		}
		int time = Integer.parseInt(iN);
		printDistance(speed, time);
	}
	public static void printDistance(int s, int t) throws IOException {
		PrintWriter wr = new PrintWriter("/home/victor/Desktop/distance.txt");
		wr.println("\tHours          Distance");
		System.out.println("\tHours          Distance");
		for (int x = 1; x <= t; x++) {
			int d = s * x;
			System.out.printf("\t%d               %d\n", x, d);
			wr.printf("\t%d               %d\n", x, d);
		}
		System.out.print("A file will be generated. Press enter to continue..");
		Scanner n = new Scanner(System.in);
		n.nextLine();
		JOptionPane.showMessageDialog(null, "Your file has been generated succesfully.");
		wr.close();
	}
}
