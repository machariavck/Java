
public class LabActivity extends GradedActivity {
	
	private double labScore;

	public LabActivity(double scored, double questions) {
		labScore = scored;
		setScore(scored / questions * 100);
	}

	public void setLabScore(double s) {
		labScore = s;
	}

	public double getLabScore() {
		return labScore;
	}

	@Override
	public String toString() {
		return String.format("Lab Activity\n\nScore: %.0f", getScore());
	}
}