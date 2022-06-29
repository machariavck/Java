
public class Essay extends GradedActivity {

	private int grammar;
	private int spelling;
	private int correctLength;
	private int content;

	public Essay(int g, int s, int cl, int c) {
		grammar = g;
		spelling = s;
		correctLength = cl;
		content = c;
		setScore(g + s + cl + c);
	}

	public int getGrammarPoints() {
		return grammar;
	}

	public int getSpellingPoints() {
		return spelling;
	}

	public int getCorrectLengthPoints() {
		return correctLength;
	}

	public int getContentPoints() {
		return content;
	}

	public String toString() {
		return "\nGrammar Points: " + grammar + "\nSpelling Points: " + spelling + "\nCorrect Length Points: " + correctLength +
				"\nContent Points: " + content + "\nOverall Score: " + getScore() + "\nGrade: " + getGrade();
	}
}