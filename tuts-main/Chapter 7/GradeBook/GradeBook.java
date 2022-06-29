import java.util.ArrayList;

public class GradeBook {

	ArrayList<String> names;
	private char[] grades;
	int[][] testScores;

	public GradeBook(int n, int s) {
		names = new ArrayList<>(n);
		grades = new char[n];
		testScores = new int[n][s];
	}

	public void setName(String s) {
		names.add(s);
	}

	public void setScores(int n, int s, int v) {
		testScores[n][s] = v;
	}

	public int getTestScores(int n, int s) {
		return testScores[n][s];
	}

	public String getName(int i) {
		return names.get(i);
	}

	public int average(int i) {
		double total = 0;
		for (int t = 0; t < 4; t++)
			total += testScores[i][t];
		return (int)(total / 4);
	}

	public char grading(int i) {
		int t = average(i);
		char grade = 'F';
		if (t > 89 && grade <= 100) grade = 'A';
		else if (t > 79) grade = 'B';
		else if (t > 69) grade = 'C';
		else if (t > 59) grade = 'D';
		return grade;
	}
}
