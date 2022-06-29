import javax.swing.*;

public class FinalExam2 extends GradedActivity2 {

	private int totQuestions;
	private double pointsEach;
	private int failedQuestions;

	public FinalExam2(int q, int m) {
		totQuestions = q;
		failedQuestions = m;
		pointsEach = 100.0 / q;
		setScore(pointsEach * (q - m));
		adjustScore();
	}

	public void adjustScore() {
		double fraction = score - (int) score;
		if (fraction >= 0.5)
			score += (1 - fraction);
	}
	

	public double getPointsEach() {
		return pointsEach;
	}

	public int getFailedQuestions() {
		return failedQuestions;
	}

}