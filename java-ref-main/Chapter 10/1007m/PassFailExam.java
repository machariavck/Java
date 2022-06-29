
public class PassFailExam extends PassFailActivity {

	private int numQuestions;
	private double pointsEach;
	private int numMissed;

	public PassFailExam(int q, int m, double minPassing) {
		super(minPassing);
		numQuestions = q;
		numMissed = m;
		pointsEach = 100 / q;
		setScore(100 - (m * pointsEach));
	}

	public double getPointsEach() {
		return pointsEach;
	}

	public int getNumMissed() {
		return numMissed;
	}
}