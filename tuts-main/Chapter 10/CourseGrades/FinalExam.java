
public class FinalExam extends GradedActivity {

	private int totQuestions;
	private double pointsEach;
	private int failedQuestions;

	public FinalExam(int q, int m) {
		totQuestions = q;
		failedQuestions = m;
		pointsEach = 100.0 / q;
		setScore(pointsEach * (q - m));
	}

	public double getPointsEach() {
		return pointsEach;
	}

	public boolean equals(GradedActivity h) {
		boolean b = false;
		if (this.getScore() == h.getScore())
			b = true;
		return b;
	}

	public boolean isGreater(GradedActivity g) {
		boolean b = false;
		if (this.getScore() > g.getScore())
			b = true;
		return b;
	}

	public boolean isLess(GradedActivity g) {
		boolean b = false;
		if (this.getScore() < g.getScore())
			b = true;
		return b;
	}

	public int getFailedQuestions() {
		return failedQuestions;
	}

	@Override
	public String toString() {
		return String.format("Final Exam\n\nScore: %.0f", getScore());
	}
}