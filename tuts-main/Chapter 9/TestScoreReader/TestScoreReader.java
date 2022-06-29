import java.io.*;
import java.util.*;

public class TestScoreReader {

	private String[] scores;
	private int[][] student = new int[5][5];

	public TestScoreReader(String f) throws IOException {
		File of = new File(f);
		Scanner scf = new Scanner(of);
		int t = 0;
		while (scf.hasNext()) {
			String l = scf.nextLine();
			scores = l.split(",");
			for (int i = 0; i < scores.length; i++)
				student[t][i] = Integer.parseInt(scores[i]);
			t++;
		}
	}

	public double getAverage(int f) {
		double total = 0;
		for (int x : student[f])
			total += x;
		return total / student[f].length;
	}

}