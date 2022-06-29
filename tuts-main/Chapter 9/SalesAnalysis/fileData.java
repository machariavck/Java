import java.io.*;
import java.util.*;

public class fileData {

	private double[][] rr;

	public fileData(String fileName) throws IOException {
		File of = new File(fileName);
		Scanner sc = new Scanner(of);
		writeData(sc);
	}

	public void writeData(Scanner sc) {
		int count = 0;
		double[][] temp = new double[100][7];
		while (sc.hasNext()) {
			count++;
			String in = sc.nextLine();
			String[] ggg = in.split(",");
			for (int i = 0; i < 7; i++)
				temp[count-1][i] = Double.parseDouble(ggg[i]);
		}
		rr = new double[count][7];
		for (int i = 0; i < count; i++) {
			for (int t = 0; t < 7; t++)
				rr[i][t] = temp[i][t];
		}
	}

	public double[] getWeekData(int i) {
		return rr[i];
	}

	public int getNumOfWeeks() {
		return rr.length;
	}
}