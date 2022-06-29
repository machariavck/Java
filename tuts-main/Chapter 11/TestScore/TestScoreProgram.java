import java.util.*;
import java.io.*;


public class TestScoreProgram {

	public static void main(String[] sth) throws Exception {
		//TestScores tp = new TestScores(takeScores());
		//runAverage(tp);
		//serialize(tp);
		deserialize();
	}


	public static void deserialize() throws IOException, ClassNotFoundException {
		ObjectInputStream g = new ObjectInputStream(new FileInputStream("Object.dat"));
		TestScores p = (TestScores)(g.readObject());
		boolean b = true;
		System.out.println("Here are the testscores from the file Object.dat");
		int i = 0;
		while (b) {
			try {
				System.out.println("TestScore " + (i + 1) + ": " + p.getTestScore(i));
				i++;
			} catch (IndexOutOfBoundsException e) {
				b = false;
				System.out.println("End of file reached");
			}
		}
		System.out.println("It's done.");
	}


	public static void serialize(TestScores tp) throws IOException {
		ObjectOutputStream g = new ObjectOutputStream(new FileOutputStream("Object.dat"));
		g.writeObject(tp);
		System.out.println("Data written to Object.dat");
	}


	public static void runAverage(TestScores tp) {
		int av;
		boolean stop = false;
		while (!stop) {
			try {
				System.out.println("The average is " + tp.average());
				stop = true;
			} catch (InvalidTestScore e) {
				System.out.println(e.getMessage());
				tp.removeValue(e.getValue());
			}
		}
	}


	public static int[] takeScores() {
		Scanner s = new Scanner(System.in);
		System.out.println("How many test scores do you wanna run?");
		int count = s.nextInt();
		int[] num = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.print("Test Score " + (i + 1) + ": ");
			num[i] = s.nextInt();
		}
		return num;
	}
}