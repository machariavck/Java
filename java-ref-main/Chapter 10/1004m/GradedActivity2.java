import javax.swing.*;

public class GradedActivity2 {

	protected double score;

	public void setScore(double s) {
		score = s;
	}

	public double getScore() {
		return score;
	}

	public final char getGrade() {
		char g;
		if (score > 89)
			g = 'A';
		else if (score > 69)
			g = 'B';
		else if (score > 49)
			g = 'C';
		else if (score > 39)
			g = 'D';
		else
			g = 'F';
		return g;
	}
}