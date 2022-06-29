
public class PassFailActivity extends GradedActivity {

	private double minPassingScore;

	public PassFailActivity (double m) {
		minPassingScore = m;
	}

	@Override
	public char getGrade() {
		char letterGrade;
		if (super.getScore() >= minPassingScore)
			letterGrade = 'P';
		else
			letterGrade = 'F';
		return letterGrade;
	}
}