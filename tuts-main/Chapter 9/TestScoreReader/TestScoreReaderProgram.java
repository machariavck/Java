import java.io.*;

public class TestScoreReaderProgram {

	public static void main(String[] sth) throws IOException {
		TestScoreReader tsr = new TestScoreReader("Book1.csv");
		for (int i = 0; i < 5; i++)
			System.out.printf("Average for student %d is %.1f\n", (i + 1), tsr.getAverage(i));
		System.out.println("No more scores");
	}
}