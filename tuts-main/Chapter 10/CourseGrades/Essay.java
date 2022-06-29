
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

	public Essay(int s) {
		setScore(s);
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

	@Override
	public String toString() {
		return String.format("Essay\n\nScore: %.0f", getScore());
	}
}