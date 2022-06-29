import javax.swing.*;

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

	public int getFailedQuestions() {
		return failedQuestions;
	}

}