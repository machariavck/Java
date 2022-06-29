import java.util.ArrayList;
import java.io.Serializable;

public class TestScores implements Serializable {

	private ArrayList<Integer> testScores;

	public TestScores(int... t) {
		testScores = new ArrayList<>(t.length);
		for (int i = 0; i < t.length; i++)
			testScores.add(t[i]);
	}


	public int getTestScore(int i) {
		return testScores.get(i);
	}


	public int average() throws InvalidTestScore {
		int total = 0;
		for (int i : testScores) {
			if (i < 0 || i > 100)
				throw new InvalidTestScore(i);
			total += i;
		}
		return total / testScores.size();
	}


	public void removeValue(int t) {
		int x = -1;
		for (int i = 0; i < testScores.size(); i++) {
			if (testScores.get(i) == t)
				x = i;
		}
		if (x != -1)
			testScores.remove(x);
	}
}