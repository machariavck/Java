import javax.swing.*;
import java.util.*;
import java.io.*;

public class WordCounter {

	public static void main(String[] sth) throws IOException {
		String in = JOptionPane.showInputDialog("Enter the name of a file, I present the number of words the file contains");
		int num = countWords(in);
		JOptionPane.showMessageDialog(null, "Your file has " + num + " words");
	}

	public static int countWords(String p) throws IOException {
		File of = new File(p);
		Scanner in = new Scanner(of);
		int count = 0;
		while (in.hasNext()) {
			String g = in.nextLine();
			String[] r = g.split(" ");
			count += r.length;
		}
		return count;
	}
}